// Last updated: 5/15/2026, 1:52:27 PM
1class Solution {
2    public char repeatedCharacter(String s) {
3        Map<Character, Integer> mp = new HashMap<>();
4
5        for(int i=0; i<s.length(); i++){
6            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
7            if(mp.get(s.charAt(i)) == 2) return s.charAt(i);
8        }
9        return 0;
10    }
11}