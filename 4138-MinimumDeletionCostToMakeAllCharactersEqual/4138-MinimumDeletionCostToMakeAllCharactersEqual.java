// Last updated: 5/11/2026, 9:53:39 AM
class Solution {
    public long minCost(String s, int[] cost) {
        long total = 0;
        long[] sum = new long[26];

        for (int i = 0; i < s.length(); i++) {
            int k = s.charAt(i) - 'a';
            sum[k] += cost[i];
            total += cost[i];
        }

        long mx = 0;
        for (long v : sum) mx = Math.max(mx, v);

        return total - mx;
    }
}
