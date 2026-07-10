// Last updated: 7/10/2026, 8:12:37 AM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Set<Integer> set = new HashSet<>();
4        Set<Integer> mp = new HashSet<>();
5
6        for(int i : nums1) mp.add(i);
7        for(int i : nums2) if(mp.contains(i)) set.add(i);
8
9        int[] arr = new int[set.size()];
10        int idx = 0;
11
12        for(int i : set){
13            arr[idx] = i;
14            idx++;
15        }
16
17        return arr;
18    }
19}