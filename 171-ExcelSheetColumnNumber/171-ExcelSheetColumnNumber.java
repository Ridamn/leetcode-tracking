// Last updated: 5/11/2026, 9:58:42 AM
class Solution {
    public int titleToNumber(String columnTitle) {
        int x = 0;
        for(int i=0; i<columnTitle.length(); i++){
             x = x * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return x;
    
    }
}