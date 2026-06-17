// Last updated: 6/17/2026, 8:43:45 AM
class Solution {
    public int minimumSize(int[] nums, int max) {
        int p1 = 1;
        int p2 = 0;

        for(int i : nums) p2 = Math.max(p2, i);

        while(p1 < p2){
            int mid = p1 + (p2-p1)/2;

            if(check(nums, max, mid)) p2 = mid;
            else p1 = mid + 1;
        }
        return p1;
    }
    public boolean check(int[] nums, int max, int mid){
        int total = 0;

        for(int i : nums){
            int c = (i-1)/mid;
            total += c;

            if(total > max) return false;
        }
        return true;
    }
}