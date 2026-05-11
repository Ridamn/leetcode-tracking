// Last updated: 5/11/2026, 9:57:14 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        arr1[0] = nums[0];
        arr2[n-1] = nums[n-1];

        for(int i=1,j=n-2; i<n && j>=0; i++, j--){
            arr1[i] = arr1[i-1] + nums[i];
            arr2[j] = arr2[j+1] + nums[j];
        }

        for(int i=0; i<n; i++){
            if(arr1[i] == arr2[i]){
                return i;
            }
        }
        return -1;
    }
}