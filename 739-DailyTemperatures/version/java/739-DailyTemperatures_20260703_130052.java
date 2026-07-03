// Last updated: 7/3/2026, 1:00:52 PM
1class Solution {
2    public int[] dailyTemperatures(int[] temp) {
3        int[] ans = new int[temp.length];
4        Stack<Integer> st = new Stack<>();
5
6        for(int i=0; i<temp.length; i++){
7            while(!st.empty() && temp[st.peek()] < temp[i]){
8                int idx = st.pop();
9                ans[idx] = i - idx;              
10            }
11            st.push(i);
12        }
13        return ans;
14    }
15}