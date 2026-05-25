// Last updated: 5/25/2026, 12:02:27 PM
1class Solution {
2    public int calPoints(String[] operations) {
3        Stack<Integer> st = new Stack<>();
4
5        for (String i : operations) {
6            if (i.equals("C"))
7                st.pop();
8            else if (i.equals("D")) {
9                st.push(st.peek() * 2);
10            } else if (i.equals("+")) {
11                int a = st.peek();
12                int b = st.get(st.size() - 2);
13                st.push(a + b);
14            } else
15                st.push(Integer.parseInt(i));
16        }
17        int ans = 0;
18        while (!st.isEmpty()) {
19            ans += st.pop();
20        }
21        return ans;
22    }
23}