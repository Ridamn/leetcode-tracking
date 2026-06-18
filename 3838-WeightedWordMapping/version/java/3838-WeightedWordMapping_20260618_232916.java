// Last updated: 6/18/2026, 11:29:16 PM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder sb = new StringBuilder();
4        for(String s : words){
5            int c=0;
6            for(int i=0; i<s.length(); i++){
7                c += weights[s.charAt(i) - 'a'];
8            }
9            sb.append((char) ('z' - (c % 26)));
10        }
11        return sb.toString();
12    }
13}