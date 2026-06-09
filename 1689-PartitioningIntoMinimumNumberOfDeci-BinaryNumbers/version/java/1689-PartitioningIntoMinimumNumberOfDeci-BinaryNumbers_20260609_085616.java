// Last updated: 6/9/2026, 8:56:16 AM
1class Solution {
2    public int minPartitions(String n) {
3        int max = 0;
4
5        for (char c : n.toCharArray()) {
6            max = Math.max(max, c - '0');
7        }
8
9        return max;
10    }
11}