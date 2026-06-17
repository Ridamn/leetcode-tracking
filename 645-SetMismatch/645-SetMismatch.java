// Last updated: 6/17/2026, 8:45:23 AM
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        int c=0;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                ans[0] = nums[i];
                break;
            }
        }
        for(int i=0; i<nums.length; i++){
            c += nums[i];
        }
        
        int n=nums.length;
        int total = n*(n+1)/2;
        ans[1] = total - (c - ans[0]);
        return ans;
    }
}