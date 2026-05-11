// Last updated: 5/11/2026, 9:56:11 AM
class Solution {
    public int numberOfMatches(int n) {
        int t = 0;
        while(n>1){
            int temp = n/2;
            t += temp;
            n -= temp; 
        }
        return t;
    }
}