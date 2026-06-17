// Last updated: 6/17/2026, 8:44:15 AM
class Solution {
    public int balancedStringSplit(String s) {
        int c=0;
        int ans=0;
        for(char i : s.toCharArray()){
            if(i == 'R') c++;
            else c--;
            if(c==0) ans++;
        }
        return ans;
    }
}