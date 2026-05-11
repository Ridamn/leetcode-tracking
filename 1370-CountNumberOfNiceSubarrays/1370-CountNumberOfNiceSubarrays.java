// Last updated: 5/11/2026, 9:56:38 AM
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k-1);
    }

    public static int atMost(int[] nums, int k){


        int ans = 0;
        int c = 0;
        int j = 0;

        for(int i=0; i<nums.length; i++){
            if (nums[i] % 2 != 0) c++;
               
            while(c > k){
                if(nums[j] % 2 != 0){
                    c--;
                }
                j++;
            }
            ans += i-j+1;;
        }
        return ans;
    }
}