// Last updated: 6/20/2026, 9:25:51 AM
1class Solution {
2    public String firstPalindrome(String[] words) {
3        for(String s : words){
4            if(palidrome(s)) return s;
5        }
6        return "";
7    }
8
9    public boolean palidrome(String s){
10        int p1=0;
11        int p2=s.length()-1;
12        while(p1<p2){
13            if(s.charAt(p1) == s.charAt(p2)){
14                p1++;
15                p2--;
16            }
17            else return false;
18        }
19        return true;
20    }
21}