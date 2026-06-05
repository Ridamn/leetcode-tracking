// Last updated: 6/5/2026, 11:33:31 AM
1class Solution {
2    public String truncateSentence(String s, int k) {
3        String[] arr = s.split("\\s+");
4
5        StringBuilder sb = new StringBuilder();
6
7        for(int i=0; i<k; i++){
8            sb.append(arr[i]);
9            if(i != k-1){
10                sb.append(" ");
11            }
12        }
13        
14
15        return sb.toString();
16    }
17}