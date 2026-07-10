// Last updated: 7/10/2026, 8:06:58 AM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Set<Integer> set = new HashSet<>();
4        Map<Integer, Integer> mp = new HashMap<>();
5        for(int i : nums1) mp.put(i, mp.getOrDefault(i, 0)+1);
6        for(int i : nums2) if(mp.containsKey(i)) set.add(i);
7        int[] arr = new int[set.size()];
8        int idx = 0;
9        for(int i : set){
10            arr[idx] = i;
11            idx++;
12        }
13        return arr;
14    }
15}