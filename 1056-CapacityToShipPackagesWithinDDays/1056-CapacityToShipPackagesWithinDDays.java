// Last updated: 6/17/2026, 8:44:42 AM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int p1 = 0;
        int p2 = 0;

        for(int i : weights){
            p1 = Math.max(p1, i);
            p2 += i;
        }

        while(p1 < p2){
            int mid = p1 + (p2 - p1) / 2;

            if(check(weights, days, mid)){
                p2 = mid;
            }
            else{
                p1 = mid + 1;
            }
        }

        return p1;
    }



    public boolean check(int[] arr, int d, int mid){
        int c = 1;
        int sum = 0;

        for(int i : arr){
            if(i>mid) return false;
            if(sum + i > mid){
                c++;
                sum = i;
            }
            else{
                sum += i;
            }

            if(c > d) return false;
        }

        return true;
    }
}