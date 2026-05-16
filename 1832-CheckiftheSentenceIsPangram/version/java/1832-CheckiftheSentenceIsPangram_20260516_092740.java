// Last updated: 5/16/2026, 9:27:40 AM
1class Solution {
2    public boolean checkIfPangram(String sentence) {
3        Map<Character, Integer> mp = new HashMap<>();
4
5        for(int i=0; i<sentence.length(); i++){
6            mp.put(sentence.charAt(i), mp.getOrDefault(sentence.charAt(i), 0)+1);
7        }
8        return mp.size() == 26;
9    }
10}