// Last updated: 6/5/2026, 9:14:46 AM
1class Solution {
2    public int digitFrequencyScore(int n) {
3        int ans=0;
4        while(n != 0){
5            int i = n%10;
6            ans += i;
7            n /= 10;
8        }
9        return ans;
10    }
11}