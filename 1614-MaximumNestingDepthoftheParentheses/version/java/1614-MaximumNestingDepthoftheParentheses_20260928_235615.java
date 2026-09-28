// Last updated: 9/28/2026, 11:56:15 PM
1class Solution {
2    public int maxDepth(String s) {
3        int ans = 0;
4        Stack<Character> stack = new Stack<>();
5
6        for (char c : s.toCharArray()) {
7            if (c == '(') {
8                stack.push(c);
9                ans = Math.max(ans, stack.size());
10            } 
11            else if (c == ')') {
12                stack.pop();
13            }
14        }
15
16        return ans;
17    }
18}