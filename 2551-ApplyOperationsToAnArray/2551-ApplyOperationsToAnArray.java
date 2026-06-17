// Last updated: 6/17/2026, 8:43:08 AM
class Solution {
    public int[] applyOperations(int[] nums) {
        int p1=0;
        for(int p2=1; p2<nums.length; p2++){
            if(nums[p1] != nums[p2]) p1++;
            else if(nums[p1] == nums[p2]){
                nums[p1] *= 2;
                nums[p2] = 0;
                p1++;
            }
        }
        p1=0;
        for(int p2=0; p2<nums.length; p2++){
            if(nums[p2] != 0){
                nums[p1] = nums[p2];
                p1++;
            }
        }
        while(p1<nums.length){
            nums[p1]=0;
            p1++;
        }

        return nums;
    }
}