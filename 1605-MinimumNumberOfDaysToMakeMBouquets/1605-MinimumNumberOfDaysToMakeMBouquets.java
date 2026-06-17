// Last updated: 6/17/2026, 8:44:03 AM
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length) return -1;

        int ans = 0;
        int p1 = 0;
        int p2 = Integer.MAX_VALUE;

        while(p1<=p2){
            int mid = p1 + (p2-p1)/2;

            if(check(bloomDay, m, k, mid)){
                ans = mid;
                p2 = mid-1;
            }else p1 = mid+1;
        }
        return ans;
    }
    public boolean check(int[] nums, int m, int k, int mid){
        int c=0;
        int b=0;

        for(int i : nums){
            if(i <= mid){
                c++;
            }
            else c=0;

            if(c == k){
                b++;
                c=0;
            }
        }
        return b>=m;
    }
}