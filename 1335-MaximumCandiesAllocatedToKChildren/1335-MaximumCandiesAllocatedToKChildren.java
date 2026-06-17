// Last updated: 6/17/2026, 8:44:16 AM
class Solution {
    public int maximumCandies(int[] candies, long k) {
        // if(k>candies.length) return 0;

        int p1=1;
        int p2=0;
        
        for(int i : candies) p2 = Math.max(p2, i);

        int ans=0;

        while(p1<=p2){
            int mid=p1+(p2-p1)/2;

            if(check(candies, k, mid)){
                ans = mid;
                p1 = mid+1;
            }
            else p2 = mid-1;
        }

        return ans;
    }

    public boolean check(int[] arr, long k, int mid){
        long c=0;

        for(int i : arr){
            c += i/mid;
            
        }
        return c >= k;
    }
}