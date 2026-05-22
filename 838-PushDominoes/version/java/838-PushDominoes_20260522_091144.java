// Last updated: 5/22/2026, 9:11:44 AM
1class Solution {
2    public String pushDominoes(String dominoes) {
3        int n= dominoes.length();
4        int c=0;
5
6        int[] right = new int[n];
7        int[] left = new int[n];
8
9        for(int i=n-1; i>=0; i--){
10            if(dominoes.charAt(i)=='L'){
11                c=n;
12                left[i]=c;
13            }
14            else if(dominoes.charAt(i)=='R'){
15                c=0;
16                left[i]=0;
17            }
18            else{
19                c=Math.max(c-1,0);
20                left[i]=c;
21            }
22        }
23        c=0;
24        for(int i=0; i<n; i++){
25            if(dominoes.charAt(i)=='R'){
26                c=n;
27                right[i]=c;
28            }
29            else if(dominoes.charAt(i)=='L'){
30                c=0;
31                right[i]=0;
32            }
33            else{
34                c=Math.max(c-1,0);
35                right[i]=c;
36            }
37        }
38    
39        System.out.println("left: " + Arrays.toString(left));
40        System.out.println("right: "+ Arrays.toString(right));
41
42        StringBuilder s = new StringBuilder();
43        for(int i=0; i<n; i++){
44            if(left[i] > right[i]) s.append("L");
45            else if(left[i] < right[i]) s.append("R");
46            else s.append(".");
47        }
48        return s.toString();
49    }
50}