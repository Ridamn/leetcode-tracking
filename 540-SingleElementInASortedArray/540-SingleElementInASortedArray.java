// Last updated: 6/17/2026, 8:45:33 AM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int p1 = 0;
        int p2 = nums.length-1;

        while(p1<p2){
            int mid = p1 + (p2-p1)/2;

            if(mid % 2 == 1) mid--;
            if(nums[mid] == nums[mid+1]) p1 = mid+2;
            else p2 = mid;
        }
        return nums[p1];
    }
}