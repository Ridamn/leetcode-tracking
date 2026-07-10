// Last updated: 7/10/2026, 8:23:29 AM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        List<Integer> list = new ArrayList<>();
4        Map<Integer, Integer> mp = new HashMap<>();
5
6        for (int num : nums1)
7            mp.put(num, mp.getOrDefault(num, 0) + 1);
8
9        for (int num : nums2) {
10            if (mp.getOrDefault(num, 0) > 0) {
11                list.add(num);
12                mp.put(num, mp.get(num) - 1);
13            }
14        }
15
16        int[] ans = new int[list.size()];
17        for (int i = 0; i < list.size(); i++)
18            ans[i] = list.get(i);
19
20        return ans;
21    }
22}