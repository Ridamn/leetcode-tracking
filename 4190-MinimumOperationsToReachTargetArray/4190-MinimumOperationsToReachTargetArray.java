// Last updated: 5/11/2026, 9:53:13 AM
class Solution {
    public int minOperations(int[] nums, int[] target) {

        boolean[] seen = new boolean[100001];
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target[i] && !seen[nums[i]]) {
                seen[nums[i]] = true;
                c++;
            }
        }
        return c;
    }
}
