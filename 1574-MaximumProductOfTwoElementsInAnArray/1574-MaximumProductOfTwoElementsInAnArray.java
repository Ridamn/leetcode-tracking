// Last updated: 6/17/2026, 8:44:06 AM
class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int max2 = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max2 = max;
                max = nums[i];
            }
            
            else if(max2<nums[i]) max2 = nums[i];
            System.out.println("max "+max+" max2 "+max2);
        }

        return (max-1)*(max2-1);
        
    }
}