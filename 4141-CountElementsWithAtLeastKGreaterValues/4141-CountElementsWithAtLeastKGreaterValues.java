// Last updated: 5/11/2026, 9:53:36 AM
class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int c = 0;
        int g = 0;

        int i = n - 1;
        while (i >= 0) {
            int j = i;
            while (j >= 0 && nums[j] == nums[i]) j--;
            int f = i - j;

            if (g >= k) c += f;

            g += f;
            i = j;
        }

        return c;
    }
}
