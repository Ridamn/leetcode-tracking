// Last updated: 5/11/2026, 9:57:57 AM
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int f=Integer.MAX_VALUE;
        int s=Integer.MAX_VALUE;

        for(int n : nums){
            if(f >= n) f = n;
            else if(s >= n) s = n;
            else return true;
        }
        return false;
    }
}