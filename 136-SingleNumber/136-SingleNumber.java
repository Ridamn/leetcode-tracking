// Last updated: 5/11/2026, 9:59:03 AM
class Solution {
    public int singleNumber(int[] nums) {
        
        int n=0;
        for(int i : nums){
            n = n^i;
        }
        return n;
    }
}