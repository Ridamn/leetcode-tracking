// Last updated: 5/11/2026, 10:31:15 AM
1class Solution {
2    public int maxSatisfied(int[] cus, int[] g, int m) {
3        int ans = 0;
4        int c = 0;
5        int j = 0;
6        int max = 0;
7
8        for(int i = 0; i < cus.length; i++){
9            if(g[i] == 0){
10                ans += cus[i];
11            }
12        }
13
14        for(int i = 0; i < cus.length; i++){
15            if(g[i] == 1){
16                c += cus[i];
17            }
18
19            if(i - j + 1 > m){
20                if(g[j] == 1){
21                    c -= cus[j];
22                }
23                j++;
24            }
25
26            max = Math.max(c, max);
27        }
28
29        return ans + max;
30    }
31}