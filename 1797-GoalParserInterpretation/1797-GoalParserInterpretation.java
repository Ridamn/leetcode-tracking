// Last updated: 6/17/2026, 8:43:51 AM
class Solution {
    public String interpret(String c) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<c.length(); i++){
            if(c.charAt(i) == 'G') sb.append('G');
            else if(c.charAt(i) == '('){
                if(c.charAt(i+1) == ')') sb.append('o');
                else sb.append("al");
            }
        }
        return sb.toString();
    }
}