// Last updated: 7/3/2026, 1:59:39 PM
1class Solution {
2    public boolean find132pattern(int[] nums) {
3        Stack<Integer> st = new Stack<>();
4        int c = Integer.MIN_VALUE;
5        for(int i=nums.length-1; i>=0; i--){
6            if(nums[i] < c) return true;
7
8            while(!st.empty() && st.peek() < nums[i]){
9                c = st.pop();
10            }
11            st.push(nums[i]);
12        }
13        return false;
14    }
15}