// Last updated: 5/11/2026, 9:56:26 AM
class Solution {
    public int[] runningSum(int[] nums) {
        int arr[] = new int[nums.length];
        arr[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            arr[i] = arr[i-1]+nums[i];
        }
        return arr;
    }
}