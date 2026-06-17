// Last updated: 6/17/2026, 8:41:11 AM
class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int sqt=0;

        while(n>0){
            int r=n%10;
            sum += r;
            sqt += r*r;
            n /= 10;
        }
        return sqt - sum >= 50;
    }
}