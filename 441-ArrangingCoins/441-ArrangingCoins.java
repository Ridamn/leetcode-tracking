// Last updated: 5/11/2026, 9:57:43 AM
class Solution {
    public int arrangeCoins(int n) {
        int c=0;
        int cc=1;
        while(n>0){
            n -= cc;
            cc++;
            c++;
        }
        if(n==0){
            return c;
        }else{
            return c-1;
        }
    }
}