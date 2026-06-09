// Last updated: 6/9/2026, 9:05:27 AM
1class Solution {
2    public String convertDateToBinary(String date) {
3        String [] arr = date.split("-");
4        StringBuilder sb = new StringBuilder();
5
6        for(String i : arr){
7            int n = Integer.parseInt(i);
8            sb.append(Integer.toBinaryString(n));
9            sb.append("-");
10        }
11        return sb.deleteCharAt(sb.length() - 1).toString();
12    }
13}