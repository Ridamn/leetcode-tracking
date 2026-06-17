// Last updated: 6/17/2026, 8:43:49 AM
class Solution {
    public int maxOperations(int[] nums, int k) {
        int ans=0;
        Arrays.sort(nums);
        // Map(Integer, Integer) mp = new HashMap<>();
        int p1=0;
        int p2=nums.length-1;
        while(p1<p2){
            if(nums[p1] + nums[p2] == k){
                ans++;
                p1++;
                p2--;
            }
            else if(nums[p1] + nums[p2] > k) p2--;
            else p1++;
        }
        return ans;
    }
}