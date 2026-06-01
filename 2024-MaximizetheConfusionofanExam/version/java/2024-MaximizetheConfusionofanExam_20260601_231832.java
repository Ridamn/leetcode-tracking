// Last updated: 6/1/2026, 11:18:32 PM
1class Solution {
2    public int maxConsecutiveAnswers(String ans, int k) {
3        int j=0;
4        int n=ans.length();
5        int res=0;
6        // int T=0, F=0;
7        // for(int i=0; i<n; i++){
8        //     if(ans.charAt(i) == 'T') T++;
9        //     else F++;
10        // }
11        // char maxFre = (T > F) ? 'T' : 'F';
12        int kk = k;
13        char maxFre = 'T';
14        for(int i=0; i<n; i++){
15            char c = ans.charAt(i);
16            while(c != maxFre && kk == 0){
17                if(ans.charAt(j) != maxFre){
18                    kk++;
19                }
20                j++;
21            }
22            if(c != maxFre){
23                kk--;
24            }
25            res = Math.max(res, i-j+1);
26        }
27        j=0;
28        int ress=0;
29        // int T=0, F=0;
30        // for(int i=0; i<n; i++){
31        //     if(ans.charAt(i) == 'T') T++;
32        //     else F++;
33        // }
34        // char maxFre = (T > F) ? 'T' : 'F';
35        maxFre = 'F';
36        for(int i=0; i<n; i++){
37            char c = ans.charAt(i);
38            while(c != maxFre && k == 0){
39                if(ans.charAt(j) != maxFre){
40                    k++;
41                }
42                j++;
43            }
44            if(c != maxFre){
45                k--;
46            }
47            ress = Math.max(ress, i-j+1);
48        }
49        return Math.max(ress, res);
50    }
51}