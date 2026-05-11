// Last updated: 5/11/2026, 9:58:12 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mp = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
        }
        
        for(int i=0; i<t.length(); i++){
            mp.put(t.charAt(i), mp.getOrDefault(t.charAt(i), 0)-1);
        }

        for(int i : mp.values()){
            if(i != 0) return false;
        }
        return true;
    }
}