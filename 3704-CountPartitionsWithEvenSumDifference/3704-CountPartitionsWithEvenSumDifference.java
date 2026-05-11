// Last updated: 5/11/2026, 9:54:52 AM
class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        for (int x : nums) total += x;

        int left = 0, ans = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            int right = total - left;
            if (Math.abs(left - right) % 2 == 0) ans++;
        }

        return ans;
    }
}
