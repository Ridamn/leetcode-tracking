// Last updated: 5/25/2026, 8:25:15 AM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int j=0;
4
5        for(int i=0; i<t.length(); i++){
6            if(j == s.length()) return true;
7            if(s.charAt(j) == t.charAt(i)) j++;
8
9        }
10        System.out.print(j);
11        return j == s.length();
12    }
13}