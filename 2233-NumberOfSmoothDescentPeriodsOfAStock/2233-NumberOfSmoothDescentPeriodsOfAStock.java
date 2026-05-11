// Last updated: 5/11/2026, 9:55:51 AM
class Solution {
    public long getDescentPeriods(int[] prices) {
        long total = 1;
        int current_length = 1;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] == prices[i - 1] - 1) {
                current_length++;
            } else {
                current_length = 1;
            }
            total += current_length;
        }

        return total;
    }
}