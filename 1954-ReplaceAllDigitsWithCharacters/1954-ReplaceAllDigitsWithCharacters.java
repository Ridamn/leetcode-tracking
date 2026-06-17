// Last updated: 6/17/2026, 8:43:40 AM
class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') sb.append(s.charAt(i));
            else {
                int n = s.charAt(i) - '0';
                sb.append((char)(s.charAt(i-1)+n));
            }
        }
        return sb.toString();
    }
}