// Last updated: 6/17/2026, 8:43:53 AM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0; i<allowed.length(); i++){
            mp.put(allowed.charAt(i), mp.getOrDefault(allowed.charAt(i), 0)+1);
        }
        int ans=words.length;
        for(int i=0; i<words.length; i++){
            String s = words[i];
            for(int j=0; j<s.length(); j++){
                if(!mp.containsKey(s.charAt(j))){
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}