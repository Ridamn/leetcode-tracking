// Last updated: 6/17/2026, 8:45:06 AM
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans= new int[temp.length];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<temp.length; i++){
            while(!st.isEmpty() && temp[st.peek()] < temp[i]){
                int idx = st.pop();
                ans[idx] = i - idx;
            }
            st.push(i);
        }
        return ans;
    }
}