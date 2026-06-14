// Last updated: 6/14/2026, 10:55:17 PM
1class Solution {
2    public String replaceDigits(String s) {
3        StringBuilder sb = new StringBuilder();
4
5        for(int i=0; i<s.length(); i++){
6            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') sb.append(s.charAt(i));
7            else {
8                int n = s.charAt(i) - '0';
9                sb.append((char)(s.charAt(i-1)+n));
10            }
11        }
12        return sb.toString();
13    }
14}