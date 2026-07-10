// Last updated: 7/10/2026, 8:35:19 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        Map<Character, Integer> mp = new HashMap<>();
4
5        for(int i=0; i<s.length(); i++){
6            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
7        }
8        
9        for(int i=0; i<t.length(); i++){
10            mp.put(t.charAt(i), mp.getOrDefault(t.charAt(i), 0)-1);
11        }
12
13        for(int i : mp.values()){
14            if(i != 0) return false;
15        }
16        return true;
17    }
18}