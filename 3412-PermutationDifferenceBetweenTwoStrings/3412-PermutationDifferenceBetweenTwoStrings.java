// Last updated: 6/17/2026, 8:42:52 AM
class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans=0;
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<t.length(); j++){
                if(s.charAt(i) == t.charAt(j)) ans += Math.abs(i-j);
            }
        }
        return ans;
    }
}