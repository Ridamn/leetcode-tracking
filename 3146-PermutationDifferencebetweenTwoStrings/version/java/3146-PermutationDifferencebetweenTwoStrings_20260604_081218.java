// Last updated: 6/4/2026, 8:12:18 AM
1class Solution {
2    public int findPermutationDifference(String s, String t) {
3        int ans=0;
4        for(int i=0; i<s.length(); i++){
5            for(int j=0; j<t.length(); j++){
6                if(s.charAt(i) == t.charAt(j)) ans += Math.abs(i-j);
7            }
8        }
9        return ans;
10    }
11}