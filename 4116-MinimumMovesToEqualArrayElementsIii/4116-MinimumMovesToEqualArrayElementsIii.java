// Last updated: 5/11/2026, 9:53:45 AM
class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int n = 0;
        for (int num : nums) {
            n += max - num;
        }

        return n;
    }
}
