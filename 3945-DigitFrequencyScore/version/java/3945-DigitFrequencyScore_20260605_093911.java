// Last updated: 6/5/2026, 9:39:11 AM
1class Solution {
2    public int countConsistentStrings(String allowed, String[] words) {
3        Map<Character, Integer> mp = new HashMap<>();
4        for(int i=0; i<allowed.length(); i++){
5            mp.put(allowed.charAt(i), mp.getOrDefault(allowed.charAt(i), 0)+1);
6        }
7        int ans=words.length;
8        for(int i=0; i<words.length; i++){
9            String s = words[i];
10            for(int j=0; j<s.length(); j++){
11                if(!mp.containsKey(s.charAt(j))){
12                    ans--;
13                    break;
14                }
15            }
16        }
17        return ans;
18    }
19}