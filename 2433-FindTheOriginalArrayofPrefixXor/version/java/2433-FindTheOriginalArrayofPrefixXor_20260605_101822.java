// Last updated: 6/5/2026, 10:18:22 AM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder sb = new StringBuilder();
4        int ans=0;
5
6        for(int i=0; i<s.length()-1; i++){
7            char c = s.charAt(i);
8
9            if(c=='('){
10                if(ans > 0) sb.append(c);
11                ans++;
12            }else{
13                ans--;
14                if(ans > 0)sb.append(c);
15            }
16            // if(s.charAt(i) == '(' && s.charAt(i+1) == ')') sb.append("()");
17        }
18        return sb.toString();
19    }
20}