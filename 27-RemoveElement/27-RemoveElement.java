// Last updated: 5/11/2026, 9:59:49 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int p1=0;
        for(int p2=0; p2<nums.length; p2++){
            if(nums[p2] != val){
                nums[p1]=nums[p2];
                p1++;
            }
        }
        return p1;
    }
}