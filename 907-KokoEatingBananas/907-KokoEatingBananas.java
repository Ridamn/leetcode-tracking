// Last updated: 6/17/2026, 8:44:55 AM
class Solution {
    public boolean check(int[] arr,int h,int mid){
        int c = 0;

        for(int i : arr){
            c += (i + mid -1)/mid;
        }
        return h >= c;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int p1 = 1;
        int p2 = 0;

        for(int i: piles) p2 = Math.max(p2, i);

        while(p1<p2){
            int mid = p1 + (p2-p1)/2;

            if(check(piles, h, mid)) p2 = mid;

            else p1 = mid + 1;

        }
        return p1;
    }
}