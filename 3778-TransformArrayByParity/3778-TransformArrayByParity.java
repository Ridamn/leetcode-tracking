// Last updated: 5/11/2026, 9:54:47 AM
class Solution {
    public int[] transformArray(int[] nums) {
        int x = 0;
        for (int i : nums){
            if(i%2==0) x++;
        }
        Arrays.fill(nums, 0);
        for(int i=x; i<nums.length; i++){
            nums[i] = 1;
        }
        return nums;
    }
}