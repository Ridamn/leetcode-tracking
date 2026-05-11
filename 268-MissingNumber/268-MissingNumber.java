// Last updated: 5/11/2026, 9:58:07 AM
class Solution {
    public int missingNumber(int[] nums) {
        int t= Arrays.stream(nums).sum();
        int n= nums.length*(nums.length+1)/2;

        return n-t;
    }
}