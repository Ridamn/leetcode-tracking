// Last updated: 5/11/2026, 9:54:09 AM
class Solution {
     public boolean isDecreasing(int[] A, int a, int b) {
        if (a == 0 || b == A.length - 1) return false;
        for (int i = a; i < b; i++)
            if (A[i] <= A[i + 1]) return false;
        
        return true;
    }
    public boolean isTrionic(int[] nums) {
        int peak = nums.length-1;
        int c=0;
        for(int i=0; i<nums.length-1; i++){
            if(peak == nums.length-1 && nums[i] >= nums[i+1]) peak = i;
            if(c == 0 && nums[nums.length - 1 - i] <= nums[nums.length-2-i]) c = nums.length - 1 - i;
            if(peak < c) return isDecreasing(nums, peak, c);
        }
        return false;
    }
}