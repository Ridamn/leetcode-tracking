// Last updated: 5/11/2026, 9:54:04 AM
class Solution {
    public int longestSubsequence(int[] nums) {
        int totalXor = 0;
        boolean allZero = true;

        for (int num : nums) {
            totalXor ^= num;
            if (num != 0) allZero = false;
        }

        if (totalXor != 0) return nums.length;
        if (allZero) return 0;
        return nums.length - 1;
    }
}
