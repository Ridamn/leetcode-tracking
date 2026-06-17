// Last updated: 6/17/2026, 8:43:38 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
        Map<Character, Integer> mp = new HashMap<>();

        for(int i=0; i<sentence.length(); i++){
            mp.put(sentence.charAt(i), mp.getOrDefault(sentence.charAt(i), 0)+1);
        }
        return mp.size() == 26;
    }
}