// Last updated: 6/17/2026, 8:41:08 AM
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] arr = new int[n*2];

        for(int i=0; i<n; i++){
            arr[i] = nums[i];
            arr[i+n] = nums[n-i-1];
        }
        return arr;
    }
}