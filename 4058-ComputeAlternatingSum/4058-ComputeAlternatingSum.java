// Last updated: 5/11/2026, 9:54:01 AM
class Solution {
    public int alternatingSum(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int total = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                total += nums[i];
            }else{
                total -=nums[i];
            }
        }
        return total;
    }
}