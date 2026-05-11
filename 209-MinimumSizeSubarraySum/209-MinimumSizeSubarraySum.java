// Last updated: 5/11/2026, 9:58:30 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int c=0;
        int j=0;

        for(int i=0; i<nums.length; i++){
            c += nums[i];

            while(c>=target){
                ans = Math.min(ans, i-j+1);
                c -= nums[j];
                j++;
            }
        }
        if(ans == Integer.MAX_VALUE) return 0;
        return ans;
    }
}