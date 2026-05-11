// Last updated: 5/11/2026, 9:56:10 AM
class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length + 1];
        arr[0] = 0;
        for(int i=0; i<gain.length; i++){
            arr[i+1] = gain[i] + arr[i];
        }
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}