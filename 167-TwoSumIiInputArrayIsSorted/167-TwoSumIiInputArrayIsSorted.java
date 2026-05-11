// Last updated: 5/11/2026, 9:58:45 AM
class Solution {
    public int[] twoSum(int[] nums, int t) {
        int[] arr = new int[2];
        int p1 = 0;
        int p2 = nums.length-1;

        while(p1<p2){
            if(nums[p1] + nums[p2] == t){
                arr[0] = p1+1;
                arr[1] = p2+1;
                break;
            }
            else if(nums[p1] + nums[p2] < t) p1++;
            else p2--;
        }
        return arr;
    }
}