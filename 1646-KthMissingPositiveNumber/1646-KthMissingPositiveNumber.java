// Last updated: 6/17/2026, 8:44:00 AM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int p1=0;
        int p2=arr.length-1;

        while(p1<=p2){
            int mid = p1 + (p2-p1)/2;

            int ans = arr[mid] - (mid+1);

            if(ans < k) p1 = mid+1;
            else p2 = mid-1;
        }
        return p1+k;
    }
}