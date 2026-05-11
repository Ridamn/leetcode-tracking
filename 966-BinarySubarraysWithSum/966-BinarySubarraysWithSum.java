// Last updated: 5/11/2026, 9:56:59 AM
class Solution {
     public int numSubarraysWithSum(int[] nums, int k){
        return atMost(nums, k) - atMost(nums, k-1);
     }
    public static int atMost(int[] nums, int k) {
        if(k < 0) return 0;
        
        int ans  = 0;
        int c = 0;
        int j = 0;

        for(int i=0; i<nums.length; i++){
            c += nums[i];

            while(c > k){
                c -= nums[j];
                j++;
            }
            ans += i-j+1;
        }
        return ans;
    }
}