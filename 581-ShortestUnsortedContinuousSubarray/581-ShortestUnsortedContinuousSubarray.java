// Last updated: 6/17/2026, 8:45:26 AM
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int mx = Integer.MIN_VALUE;
        int mi = Integer.MAX_VALUE;
        // int ans=0;
        int p1=-1;
        int p2=-1;

        for(int i=0; i<n; i++){
            if(nums[i] < mx){
                p1=i;
            }
            mx = Math.max(mx, nums[i]);
        }

        for(int i=n-1; i>=0; i--){
            if(nums[i] > mi){
                p2=i;
            }
            mi = Math.min(mi, nums[i]);
        }
        
        if(p2 == -1) return 0;

        return p1-p2+1;
    }
}