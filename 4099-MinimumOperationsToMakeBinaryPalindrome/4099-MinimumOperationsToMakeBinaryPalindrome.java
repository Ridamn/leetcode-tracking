// Last updated: 5/11/2026, 9:53:50 AM
class Solution {
    public int[] minOperations(int[] nums) {
        int mx = 0;
        for (int x : nums) if (x > mx) mx = x;

        int mxLen = (32 - Integer.numberOfLeadingZeros(mx)) + 1;

        ArrayList<Long> ps = new ArrayList<>();
        ps.add(0L);

        for (int len = 1; len <= mxLen; len++) {
            int half = (len + 1) / 2;
            int st = 1 << (half - 1);
            int en = (1 << half) - 1;

            if (half == 1) st = 1;

            for (int p = st; p <= en; p++) {
                long pal = p;
                int m = (len % 2 == 1) ? (p >> 1) : p;
                int bits = (len % 2 == 1) ? half - 1 : half;

                for (int i = 0; i < bits; i++) {
                    pal = (pal << 1) | (m & 1);
                    m >>= 1;
                }
                ps.add(pal);
            }
        }

        Collections.sort(ps);

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            long x = nums[i];
            int idx = Collections.binarySearch(ps, x);

            if (idx >= 0) {
                ans[i] = 0;
                continue;
            }

            int pos = -idx - 1;
            long best = Long.MAX_VALUE;

            if (pos < ps.size()) best = Math.min(best, Math.abs(ps.get(pos) - x));
            if (pos - 1 >= 0) best = Math.min(best, Math.abs(ps.get(pos - 1) - x));

            ans[i] = (int) best;
        }

        return ans;
    }
}