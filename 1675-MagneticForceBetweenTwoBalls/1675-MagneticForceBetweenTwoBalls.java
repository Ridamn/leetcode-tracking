// Last updated: 6/17/2026, 8:43:59 AM
class Solution {
    public int maxDistance(int[] position, int m) {
        int ans = 0;
        Arrays.sort(position);

        int p1 = 1;
        int p2 = position[position.length - 1] - position[0];

        while(p1 <= p2){
            int mid = p1+(p2-p1)/2;

            if(check(position, m, mid)){
                ans = mid;
                p1 = mid + 1;
            }
            else p2 = mid-1;
        }
        return ans;
    }

    public boolean check(int[] nums, int m, int mid){
        int c=1;
        int prev=nums[0];
        

        for(int i=1; i<nums.length; i++){
            int curr =nums[i];
            if(curr - prev >= mid){
                c++;
                prev = curr;
            }
        }
        return c >= m;
    }
}
