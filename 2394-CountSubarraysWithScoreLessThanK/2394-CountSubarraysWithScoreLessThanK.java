// Last updated: 5/11/2026, 9:55:37 AM
class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;

        long ans = 0;
        long c=0;
        int j=0;

       for(int i=0; i<n; i++){
        c += nums[i];
        while(c * (i-j+1) >= k){
            c -= nums[j];
            j++;
        }
        ans += (i-j+1);
       } 
       return ans;
    }
}