// Last updated: 5/11/2026, 9:56:28 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n*2];
        int p1=0; 
        int p2=n;
        int i=0;
        while(i<n*2){
            arr[i] = nums[p1];
            i++;
            arr[i] = nums[p2];
            i++;
            p1++;
            p2++;
        }
        return arr;
    }
}