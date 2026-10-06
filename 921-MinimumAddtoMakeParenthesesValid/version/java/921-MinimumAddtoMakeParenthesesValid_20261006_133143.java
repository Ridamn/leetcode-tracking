// Last updated: 10/6/2026, 1:31:43 PM
1class Solution {
2    public int minAddToMakeValid(String s) {
3        Deque<Character> stack = new ArrayDeque<>();
4
5        for(char c : s.toCharArray()){
6           if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
7                stack.pop();
8            }
9           else stack.push(c);
10        }
11
12        return stack.size();
13    }
14}