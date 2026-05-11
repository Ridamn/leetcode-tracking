// Last updated: 5/11/2026, 9:57:30 AM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int c = 0;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    c++;
                }
            }
        }
        return c;
    }
}