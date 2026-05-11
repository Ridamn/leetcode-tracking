// Last updated: 5/11/2026, 9:56:23 AM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n=0;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                n += map.get(nums[i]);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        return n;
    }
}