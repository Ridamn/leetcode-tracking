// Last updated: 5/11/2026, 9:53:55 AM
class Solution {
    public int maxDistinct(String s) {
        // int c=0;
        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            // if(!ls.contains(s.charAt(i))) c++;
            hs.add(s.charAt(i));
        }
        return hs.size();
    }
}