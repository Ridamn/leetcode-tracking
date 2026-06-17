// Last updated: 6/17/2026, 8:44:48 AM
class Solution {
    // class Pr{
    //     int v=null;
    //     int m=null;
    // }

    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> st = new Stack<>();
        long ans = 0;
        st.push(-1);

        for(int i=0; i<=arr.length; i++){
            int curr;
            if(i<arr.length){
                curr=arr[i];
            }else curr = 0;

            while(st.peek() != -1 && curr <= arr[st.peek()]){
                int idx = st.pop();
                // int j = st.peek();
                int l=idx-st.peek();
                int r=i-idx;
                long add = (long)l * r % 1000000007 * arr[idx] % 1000000007;
                ans += add;
                ans %= 1000000007;

                
            }
            st.push(i);
        }
        return (int)ans;

    }
}