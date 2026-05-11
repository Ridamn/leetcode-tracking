// Last updated: 5/11/2026, 9:57:36 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int c=0;
        int c2=0;
        for(int i=0; i<nums.length; i++){
            if(i==nums.length-1 && nums[i]==1){
                c2++;
                c = Math.max(c2, c);
                break;
            }
            else if(nums[i]==1){
                c2++;
            }else{
                c = Math.max(c2, c);
                c2=0;
            }
        }
        return c;
    }
}