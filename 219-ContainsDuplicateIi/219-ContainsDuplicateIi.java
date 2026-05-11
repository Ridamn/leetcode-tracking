// Last updated: 5/11/2026, 9:58:27 AM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> arr = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(arr.containsKey(nums[i]) && i-arr.get(nums[i]) <= k){
                return true;
            }
            arr.put(nums[i], i);
        }
        return false;
    }
}