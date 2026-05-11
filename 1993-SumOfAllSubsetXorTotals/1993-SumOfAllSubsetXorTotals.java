// Last updated: 5/11/2026, 9:56:03 AM
class Solution {
    public int subsetXORSum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total |= num; 
        }
        return total * (1 << (nums.length - 1));
    }
}