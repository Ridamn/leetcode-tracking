// Last updated: 7/16/2026, 9:47:34 AM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int max = 0;
4        int c = 0;
5        int j = 0;
6
7        for (int i = 0; i < nums.length; i++) {
8            if (nums[i] == 0) c++;
9
10            while (c > k) {
11                if (nums[j] == 0) c--;
12                j++;
13            }
14
15            max = Math.max(max, i - j + 1);
16        }
17
18        return max;
19    }
20}