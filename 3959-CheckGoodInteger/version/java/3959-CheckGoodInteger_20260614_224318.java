// Last updated: 6/14/2026, 10:43:18 PM
1class Solution {
2    public boolean checkGoodInteger(int n) {
3        int sum=0;
4        int sqt=0;
5
6        while(n>0){
7            int r=n%10;
8            sum += r;
9            sqt += r*r;
10            n /= 10;
11        }
12        return sqt - sum >= 50;
13    }
14}