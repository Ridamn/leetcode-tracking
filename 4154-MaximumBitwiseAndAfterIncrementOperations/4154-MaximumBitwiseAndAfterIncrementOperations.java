// Last updated: 5/11/2026, 9:53:30 AM
class Solution {
    public int maximumAND(int[] nums, int k, int m) {
        int ans = 0;

        for (int b = 30; b >= 0; b--) {
            int cand = ans | (1 << b);

            long[] cost = new long[nums.length];
            for (int i = 0; i < nums.length; i++) {
                cost[i] = getCost(nums[i], cand);
            }

            Arrays.sort(cost);

            long sum = 0;
            for (int i = 0; i < m; i++) {
                sum += cost[i];
            }

            if (sum <= k) {
                ans = cand;
            }
        }

        return ans;
    }

    private long getCost(long x, long cand) {
        if ((x & cand) == cand) {
            return 0;
        }

        long y = 0;
        boolean g = false;

        for (int bit = 30; bit >= 0; bit--) {
            long mask = 1L << bit;
            boolean cb = (cand & mask) != 0;
            boolean xb = (x & mask) != 0;

            if (cb) {
                y |= mask;
                if (!xb) g = true;
            } else {
                if (!g && xb) y |= mask;
            }
        }

        return y - x;
    }
}
