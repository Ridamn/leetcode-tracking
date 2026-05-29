// Last updated: 5/29/2026, 10:48:38 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int j=0;
4        int ans=0;
5        Map<Character, Integer> mp = new HashMap<>();
6
7        for(int i=0; i<s.length(); i++){
8            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
9            while(mp.get(s.charAt(i)) > 1){
10                mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0)-1);
11                j++;
12            }
13            System.out.println(mp);
14            ans=Math.max(ans, i-j+1);
15        }
16        return ans;
17    }
18}