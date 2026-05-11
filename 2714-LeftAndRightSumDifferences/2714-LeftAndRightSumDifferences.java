// Last updated: 5/11/2026, 9:55:25 AM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] Larr = new int[n];
        int[] Rarr = new int[n];
        int[] arr = new int[n];

        for(int i=1; i<n; i++){
            Larr[i] = Larr[i-1] + nums[i-1];
        }
        for(int i=n-2; i>=0; i--){
            Rarr[i] = Rarr[i+1] + nums[i+1];
        }
        for(int i=0; i<n; i++){
            arr[i] = Math.abs(Larr[i] - Rarr[i]);
        }
        return arr;
    }
}