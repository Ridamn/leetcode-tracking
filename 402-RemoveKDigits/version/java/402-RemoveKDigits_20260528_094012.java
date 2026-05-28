// Last updated: 5/28/2026, 9:40:12 AM
1class Solution {
2    public String removeKdigits(String s, int k) {
3        Stack<Integer> st = new Stack<>();
4
5        for(int i=0; i<s.length(); i++){
6            int c = s.charAt(i) - '0';
7
8            while(k>0 && !st.isEmpty() && st.peek() > c){
9                st.pop();
10                k--;
11            }
12            st.push(c);
13        }
14        while(k>0){
15            st.pop();
16            k--;
17        }
18        StringBuilder sb = new StringBuilder();
19
20        for(int i : st){
21            sb.append(i);
22        }
23
24
25        while(sb.length() > 0 && sb.charAt(0) == '0'){
26            sb.deleteCharAt(0);
27        }
28        if(sb.length() == 0) return "0" ;
29        return sb.toString();
30    }
31}