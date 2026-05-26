// Last updated: 5/26/2026, 8:35:24 AM
1class Solution {
2    // class Pr{
3    //     int v=null;
4    //     int m=null;
5    // }
6
7    public int sumSubarrayMins(int[] arr) {
8        Stack<Integer> st = new Stack<>();
9        long ans = 0;
10        st.push(-1);
11
12        for(int i=0; i<=arr.length; i++){
13            int curr;
14            if(i<arr.length){
15                curr=arr[i];
16            }else curr = 0;
17
18            while(st.peek() != -1 && curr <= arr[st.peek()]){
19                int idx = st.pop();
20                // int j = st.peek();
21                int l=idx-st.peek();
22                int r=i-idx;
23                long add = (long)l * r % 1000000007 * arr[idx] % 1000000007;
24                ans += add;
25                ans %= 1000000007;
26
27                
28            }
29            st.push(i);
30        }
31        return (int)ans;
32
33    }
34}