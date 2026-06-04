// Last updated: 6/4/2026, 12:28:18 PM
1class Solution {
2    public String interpret(String c) {
3        StringBuilder sb = new StringBuilder();
4
5        for(int i=0; i<c.length(); i++){
6            if(c.charAt(i) == 'G') sb.append('G');
7            else if(c.charAt(i) == '('){
8                if(c.charAt(i+1) == ')') sb.append('o');
9                else sb.append("al");
10            }
11        }
12        return sb.toString();
13    }
14}