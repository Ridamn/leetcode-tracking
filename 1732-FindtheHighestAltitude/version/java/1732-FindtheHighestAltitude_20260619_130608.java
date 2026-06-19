// Last updated: 6/19/2026, 1:06:08 PM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int max= 0;
4        int val=0;
5
6       
7        
8        for(int i=0; i<gain.length; i++){
9            val += gain[i];
10            max = Math.max(max, val);
11
12
13        }
14        return max;
15    }
16}