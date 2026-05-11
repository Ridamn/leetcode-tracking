// Last updated: 5/11/2026, 9:56:21 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int c = numBottles;
        while(c >= numExchange){
            int cc = c/numExchange;
            int rem = c%numExchange;
            ans += cc;
            c = cc + rem;
        }
        return ans;
    }
}