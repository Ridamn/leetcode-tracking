// Last updated: 5/11/2026, 9:59:53 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int p1=0, p2=1;
        while(p2<nums.length){
            if(nums[p1] == nums[p2]){
                p2++;
            }else{
                p1++;
                nums[p1] = nums[p2];
                p2++;
            }
        }
        return p1 +1;
    }
}