// Last updated: 7/16/2026, 10:21:55 AM
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        TreeMap<Integer, Integer> mp = new TreeMap<>();
4        int[] ans = new int[nums.length - k + 1];
5
6        for (int i = 0; i < k; i++) {
7            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
8        }
9
10        int idx = 0;
11        ans[idx++] = mp.lastKey();
12
13        for (int i = k; i < nums.length; i++) {
14            if (mp.get(nums[i - k]) == 1)
15                mp.remove(nums[i - k]);
16            else
17                mp.put(nums[i - k], mp.get(nums[i - k]) - 1);
18
19            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
20
21            ans[idx++] = mp.lastKey();
22        }
23
24        return ans;
25    }
26}