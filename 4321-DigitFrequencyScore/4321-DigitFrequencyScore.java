// Last updated: 6/17/2026, 8:41:20 AM
class Solution {
    public int digitFrequencyScore(int n) {
        int ans=0;
        while(n != 0){
            int i = n%10;
            ans += i;
            n /= 10;
        }
        return ans;
    }
}