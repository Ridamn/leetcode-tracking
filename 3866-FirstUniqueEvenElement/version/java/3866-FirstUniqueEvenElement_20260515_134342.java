// Last updated: 5/15/2026, 1:43:42 PM
1class Solution {
2    public int firstUniqueEven(int[] nums) {
3        Map<Integer, Integer> mp = new HashMap<>();
4
5        for(int i : nums){
6            mp.put(i, mp.getOrDefault(i, 0)+1);
7        }
8
9        for(int i : nums){
10            if(mp.get(i) == 1 && i % 2 == 0) return i;
11        }
12        
13        return -1;
14    }
15}