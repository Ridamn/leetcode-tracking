// Last updated: 7/14/2026, 9:08:41 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        Set<Character> set = new HashSet<>();
4
5        int j=0;
6        int max=0;
7
8        for(int i=0; i<s.length(); i++){
9            while(set.contains(s.charAt(i))){
10                set.remove(s.charAt(j));
11                j++;
12            }
13            set.add(s.charAt(i));
14            max = Math.max(max, i-j+1);
15        }
16        return max;
17    }
18}