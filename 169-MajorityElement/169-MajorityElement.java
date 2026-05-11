// Last updated: 5/11/2026, 9:58:43 AM
class Solution {
    public int majorityElement(int[] nums) {
        int can=nums[0];
        int c=0;

        for(int i=0; i<nums.length; i++){
            if(c == 0) can = nums[i];
            if(nums[i] == can)
                c++;
            else c--;
        }
        return can;
    }
}