// Last updated: 11/15/2026, 12:09:48 PM
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        return helper(n);
4    }
5
6    private boolean helper(int n){
7        System.out.println(n);
8        if(n==1) return true;
9        if(n<=0) return false;
10        if(n%3!=0) return false;
11        return helper(n/3);
12    }
13}