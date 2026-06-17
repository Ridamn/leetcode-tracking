// Last updated: 6/17/2026, 8:44:57 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int p1 = 0;
        int p2 = arr.length-1;

        while(p1<p2){
            int mid = p1 + (p2-p1)/2;

            if(mid + 1 < arr.length && arr[mid] < arr[mid+1]){
                p1 = mid + 1;
            }
            else p2 = mid;
        }
        return p1;
    }
}