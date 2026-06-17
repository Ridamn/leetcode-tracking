// Last updated: 6/17/2026, 8:42:44 AM
class Solution {
    public int minElement(int[] nums) {
        int ans= Integer.MAX_VALUE;
        int sum=0;

        for(int i : nums){
            while(i > 0){
                int n=i%10;
                sum += n;
                i /= 10;
            }
            ans = Math.min(ans, sum);
            sum = 0;
        }
        return ans;
    }
}