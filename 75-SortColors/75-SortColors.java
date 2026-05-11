// Last updated: 5/11/2026, 9:59:27 AM
class Solution {
    public void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void sortColors(int[] nums) {
        int w = 0;
        int r = 0;
        int b = nums.length-1;
        while(w<=b){
            if(nums[w] == 0){
                swap(nums, w, r);
                w++;
                r++;
            }
            else if(nums[w] == 1){
                w++;
            }else{
                swap(nums, w, b);
                b--;
            }
        }
    }
}