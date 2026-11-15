// Last updated: 11/15/2026, 12:12:46 PM
1class Solution {
2    public boolean isPowerOfFour(int n) {
3        return helper(n);
4    }
5    private boolean helper(int n){
6        if(n==1) return true;
7        if(n%4!=0) return false;
8        if(n<=0) return false;
9        return helper(n/4);
10    }
11}