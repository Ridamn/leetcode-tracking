// Last updated: 6/17/2026, 8:44:40 AM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int ans=0;

        for(int i=0; i<s.length()-1; i++){
            char c = s.charAt(i);

            if(c=='('){
                if(ans > 0) sb.append(c);
                ans++;
            }else{
                ans--;
                if(ans > 0)sb.append(c);
            }
            // if(s.charAt(i) == '(' && s.charAt(i+1) == ')') sb.append("()");
        }
        return sb.toString();
    }
}