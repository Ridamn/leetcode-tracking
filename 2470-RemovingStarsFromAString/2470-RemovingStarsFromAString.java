// Last updated: 5/11/2026, 9:55:35 AM
class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '*' && sb.length() != 0) sb.deleteCharAt(sb.length()-1);
            else if(s.charAt(i) != '*') sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}