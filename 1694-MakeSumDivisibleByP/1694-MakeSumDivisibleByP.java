// Last updated: 5/11/2026, 9:56:20 AM
class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long tot = 0;
        for (int x : nums) tot += x;
        int need = (int)(tot % p);
        if (need == 0) return 0;

        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        int ans = n;
        int cur = 0;
        for (int i = 0; i < n; i++) {
            cur = (int)((cur + (nums[i] % p)) % p);
            int want = cur - need;
            if (want < 0) want += p;
            if (m.containsKey(want)) ans = Math.min(ans, i - m.get(want));
            m.put(cur, i);
        }

        return ans == n ? -1 : ans;
    }
}