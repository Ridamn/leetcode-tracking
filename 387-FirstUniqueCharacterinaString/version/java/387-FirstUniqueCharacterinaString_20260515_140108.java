// Last updated: 5/15/2026, 2:01:08 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        Map<Character, Integer> mp = new HashMap<>();
4
5        for(int i=0; i<s.length(); i++){
6            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
7        }
8        
9        for(int i=0; i<s.length(); i++){
10            if(mp.get(s.charAt(i)) == 1) return i;
11        }
12        return -1;
13    }
14}