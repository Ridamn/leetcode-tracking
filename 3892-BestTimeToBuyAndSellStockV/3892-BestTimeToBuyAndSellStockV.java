// Last updated: 5/11/2026, 9:54:19 AM
class Solution {
    public long maximumProfit(int[] prices, int k) {

        long[] dp = new long[k + 1];     
        long[] call = new long[k];    
        long[] put = new long[k];      
        Arrays.fill(call, Long.MIN_VALUE / 2);
        Arrays.fill(put, Long.MIN_VALUE / 2);

        for (int price : prices) {
            for (int t = k; t >= 1; t--) {
                dp[t] = Math.max( dp[t], Math.max(call[t - 1] + price,put[t - 1] - price));
                call[t - 1]  = Math.max(call[t - 1], dp[t - 1] - price);
                put[t - 1] = Math.max(put[t - 1], dp[t - 1] + price);
            }
        }

        long ans = 0;
        for (long v : dp) ans = Math.max(ans, v);
        return ans;
    }
}