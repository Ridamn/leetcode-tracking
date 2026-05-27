// Last updated: 5/27/2026, 8:50:37 AM
1class Solution {
2    public int[] dailyTemperatures(int[] temp) {
3        int[] ans= new int[temp.length];
4        Stack<Integer> st = new Stack<>();
5
6        for(int i=0; i<temp.length; i++){
7            while(!st.isEmpty() && temp[st.peek()] < temp[i]){
8                int idx = st.pop();
9                ans[idx] = i - idx;
10            }
11            st.push(i);
12        }
13        return ans;
14    }
15}