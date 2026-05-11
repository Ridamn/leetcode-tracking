// Last updated: 5/11/2026, 9:56:50 AM
class Solution {
    public int longestOnes(int[] nums, int k) {
        // int[] pre = new int[nums.length];
        // pre[0] = nums[0];

        // for(int i=1; i<nums.length; i++){
        //     pre[i] = pre[i-1]+nums[i];
        // }

        int max=0;
        int c=0;
        // int i=0;
        int j=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) c++;

            while(c > k){
                if(nums[j] == 0) c--;
                j++;
            }
            max = Math.max(max, i-j+1);
        }
        return max;
    }
}