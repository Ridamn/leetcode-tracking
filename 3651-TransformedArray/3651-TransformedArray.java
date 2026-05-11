// Last updated: 5/11/2026, 9:54:56 AM
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
                arr[i] = nums[((i + nums[i]) % nums.length+nums.length)%nums.length];
            
        }
        return arr;
    }
}