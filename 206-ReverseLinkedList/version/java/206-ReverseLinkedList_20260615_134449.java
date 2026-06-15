// Last updated: 6/15/2026, 1:44:49 PM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> list = new ArrayList<>();
4        // List<Integer> arr = new ArrayList<>();
5        helper(nums, list, new ArrayList<>(), new boolean[nums.length]);
6        return list;
7    }
8
9    public void helper(int[] nums, List<List<Integer>> list, List<Integer> arr, boolean[] vis){
10        if(arr.size() == nums.length){
11            list.add(new ArrayList<>(arr));
12        }
13
14        for(int i=0; i<nums.length; i++){
15            if(vis[i]) continue;
16            vis[i] = true;
17            arr.add(nums[i]);
18            helper(nums, list, arr, vis);
19            arr.remove(arr.size()-1);
20            vis[i] = false;
21        }
22    }
23}