// Last updated: 6/17/2026, 8:43:30 AM
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        int p1 = lower(nums, target);
        int p2 = upper(nums, target);

        List<Integer> ans = new ArrayList<>();

        for (int i = p1; i < p2; i++) {
            ans.add(i);
        }

        return ans;
    }

    public int lower(int[] a, int x) {
        int l = 0, r = a.length;

        while (l < r) {
            int m = l + (r - l) / 2;

            if (a[m] >= x) r = m;
            else l = m + 1;
        }

        return l;
    }

    public int upper(int[] a, int x) {
        int l = 0, r = a.length;

        while (l < r) {
            int m = l + (r - l) / 2;

            if (a[m] > x) r = m;
            else l = m + 1;
        }

        return l;
    }
}