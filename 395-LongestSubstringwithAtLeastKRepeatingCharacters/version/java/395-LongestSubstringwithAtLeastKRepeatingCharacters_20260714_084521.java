// Last updated: 7/14/2026, 8:45:21 AM
1class Solution {
2    public int longestSubstring(String s, int k) {
3        if(s.length() == 0) return 0;
4
5        int[] freq = new int[26];
6        for(char c : s.toCharArray()) freq[c - 'a']++;
7
8        for(int i=0; i<s.length(); i++){
9            if(freq[s.charAt(i) - 'a'] < k){
10                int left = longestSubstring(s.substring(0, i), k);
11                int right = longestSubstring(s.substring(i+1), k);
12                return Math.max(left, right);
13            }
14        }
15        return s.length();
16    }
17}
18
19// LongestSubstring(s):
20//     Count frequencies
21
22//     If every frequency >= k
23//          return length(s)
24
25//     Find a character with frequency < k
26
27//     Split the string at that character
28
29//     Recursively solve each segment
30
31//     Return the maximum segment length