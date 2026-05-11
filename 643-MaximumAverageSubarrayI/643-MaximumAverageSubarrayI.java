// Last updated: 5/11/2026, 9:57:25 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }
        double max = sum;
        for(int i=k; i<nums.length; i++){
            sum = sum-nums[i-k] + nums[i];
            max = max>sum ? max:sum;
        }
        return max/k;
    }
}