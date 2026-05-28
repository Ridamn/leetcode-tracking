// Last updated: 5/28/2026, 8:21:51 AM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        int n= matrix.length;
4        int m=matrix[0].length;
5        
6        int arr[] = new int[m];
7        int ans=0;
8
9        for(int i=0; i<n; i++){
10            for(int j=0; j<m; j++){
11                if(matrix[i][j] == '1'){
12                    arr[j]++;
13                }
14                else arr[j] = 0;
15            }
16            ans = Math.max(ans, largestRectangleArea(arr));
17        }
18        
19        return ans;
20
21    }
22
23    public int largestRectangleArea(int[] h) {
24        int n = h.length;
25        int[] ps = pse(h);
26        int[] ns = nse(h);
27
28        int ans = 0;
29
30        for(int i = 0; i < n; i++){
31            int w = ns[i] - ps[i] - 1;
32            int area = h[i] * w;
33            ans = Math.max(ans, area);
34        }
35
36        return ans;
37    }
38    
39
40    public int[] pse(int[] arr){
41        int[] pss = new int[arr.length];
42        Stack<Integer> st = new Stack<>();
43
44        for(int i=0; i<arr.length; i++){
45            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
46                st.pop();
47            }
48            pss[i] = st.isEmpty() ? -1 : st.peek();
49
50            st.push(i);
51        }
52        return pss;
53    }
54
55
56    public int[] nse(int[] arr){
57        int[] nss = new int[arr.length];
58        Stack<Integer> st = new Stack<>();
59
60        for (int i = arr.length - 1; i >= 0; i--) {
61            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
62                st.pop();
63            }
64            nss[i] = st.isEmpty() ? arr.length : st.peek();
65
66            st.push(i);
67        }
68
69        return nss;
70    }
71}