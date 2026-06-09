// Last updated: 6/9/2026, 9:13:02 AM
1class Solution {
2    public int balancedStringSplit(String s) {
3        int c=0;
4        int ans=0;
5        for(char i : s.toCharArray()){
6            if(i == 'R') c++;
7            else c--;
8            if(c==0) ans++;
9        }
10        return ans;
11    }
12}