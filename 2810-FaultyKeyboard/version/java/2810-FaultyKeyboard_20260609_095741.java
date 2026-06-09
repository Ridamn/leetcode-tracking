// Last updated: 6/9/2026, 9:57:41 AM
1class Solution {
2    public String finalString(String s) {
3        StringBuilder sb = new StringBuilder();
4        for(char i : s.toCharArray()){
5            if(i == 'i') sb.reverse();
6            else sb.append(i);
7        }
8        return sb.toString();
9    }
10}