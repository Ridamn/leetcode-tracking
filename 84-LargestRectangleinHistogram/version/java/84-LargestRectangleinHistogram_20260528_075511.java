// Last updated: 5/28/2026, 7:55:11 AM
1class Solution {
2    public int largestRectangleArea(int[] h) {
3        int n = h.length;
4        int[] ps = pse(h);
5        int[] ns = nse(h);
6
7        int ans = 0;
8
9        for(int i = 0; i < n; i++){
10            int w = ns[i] - ps[i] - 1;
11            int area = h[i] * w;
12            ans = Math.max(ans, area);
13        }
14
15        return ans;
16    }
17    
18
19    public int[] pse(int[] arr){
20        int[] pss = new int[arr.length];
21        Stack<Integer> st = new Stack<>();
22
23        for(int i=0; i<arr.length; i++){
24            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
25                st.pop();
26            }
27            pss[i] = st.isEmpty() ? -1 : st.peek();
28
29            st.push(i);
30        }
31        return pss;
32    }
33
34
35    public int[] nse(int[] arr){
36        int[] nss = new int[arr.length];
37        Stack<Integer> st = new Stack<>();
38
39        for (int i = arr.length - 1; i >= 0; i--) {
40            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
41                st.pop();
42            }
43            nss[i] = st.isEmpty() ? arr.length : st.peek();
44
45            st.push(i);
46        }
47
48        return nss;
49    }
50}