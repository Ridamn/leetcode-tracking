// Last updated: 7/10/2026, 10:07:45 AM
1import java.util.HashMap;
2
3class Solution {
4    public int countKDifference(int[] nums, int x) {
5        HashMap<Integer, Integer> mp = new HashMap<>();
6        int c = 0;
7        
8        for (int i : nums) {
9            if (mp.containsKey(i + x)) {
10                c += mp.get(i + x);
11            }
12            if (mp.containsKey(i - x)) {
13                c += mp.get(i - x);
14            }
15            
16            mp.put(i, mp.getOrDefault(i, 0) + 1);
17        }
18        
19        return c;
20    }
21}