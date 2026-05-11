// Last updated: 5/11/2026, 9:57:18 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;

        int ans = 0;
        int c=1;
        int j=0;

        for(int i=0; i<nums.length; i++){
            c *= nums[i];

            while(c >= k){
                c /= nums[j];
                j++;
            }
            ans += i-j+1;
        }
        return ans;
    }
}