// Last updated: 5/11/2026, 9:59:05 AM
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int min = prices[0];
        int p = 0;

        for(int i=1; i<n; i++){
            p = Math.max(p, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return p;
    }
}