// Last updated: 5/11/2026, 9:58:51 AM
class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        // int ans = Integer.MAX_VALUE;
        while(low<high){
            int mid = low + (high-low)/2;
            if(nums[high] < nums[mid]){
                // ans = Math.min(ans, nums[low]);
                low = mid+1;
            }else{
                // ans = Math.min(ans, nums[high]);
                high = mid;
            }
        }
        return nums[low];
    }
}