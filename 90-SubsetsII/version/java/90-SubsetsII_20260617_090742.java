// Last updated: 6/17/2026, 9:07:42 AM
1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        Arrays.sort(nums);
4
5        List<List<Integer>> ans = new ArrayList<>();
6        helper(0, nums, new ArrayList<>(), ans);
7
8        return ans;
9    }
10
11    void helper(int idx, int[] nums,
12                List<Integer> arr,
13                List<List<Integer>> ans) {
14
15        ans.add(new ArrayList<>(arr));
16
17        for (int i = idx; i < nums.length; i++) {
18
19            if (i > idx && nums[i] == nums[i - 1]) {
20                continue;
21            }
22
23            arr.add(nums[i]);
24
25            helper(i + 1, nums, arr, ans);
26
27            arr.remove(arr.size() - 1);
28        }
29    }
30}