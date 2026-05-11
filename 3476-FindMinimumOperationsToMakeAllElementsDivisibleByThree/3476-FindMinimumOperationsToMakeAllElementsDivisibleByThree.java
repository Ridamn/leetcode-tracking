// Last updated: 5/11/2026, 9:55:03 AM
class Solution {
    public int minimumOperations(int[] nums) {
        int n=0;
        for(int i : nums){
            n += Math.min(i%3, 3-(i%3));
        }

        return n;
    }
}