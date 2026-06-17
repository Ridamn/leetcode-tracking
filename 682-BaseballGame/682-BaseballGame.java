// Last updated: 6/17/2026, 8:45:21 AM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String i : operations) {
            if (i.equals("C"))
                st.pop();
            else if (i.equals("D")) {
                st.push(st.peek() * 2);
            } else if (i.equals("+")) {
                int a = st.peek();
                int b = st.get(st.size() - 2);
                st.push(a + b);
            } else
                st.push(Integer.parseInt(i));
        }
        int ans = 0;
        while (!st.isEmpty()) {
            ans += st.pop();
        }
        return ans;
    }
}