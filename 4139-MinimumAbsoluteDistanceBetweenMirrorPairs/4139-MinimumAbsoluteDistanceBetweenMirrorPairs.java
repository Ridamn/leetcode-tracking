// Last updated: 5/11/2026, 9:53:37 AM
class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int[] fer = nums;
        int n = fer.length;
        HashMap<Integer, Integer> m = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for (int j = 0; j < n; j++) {
            int v = fer[j];
            if (m.containsKey(v)) {
                int d = j - m.get(v);
                if (d < ans) ans = d;
            }
            int r = rev(v);
            m.put(r, j);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private int rev(int x) {
        int r = 0;
        while (x > 0) {
            r = r * 10 + x % 10;
            x /= 10;
        }
        return r;
    }
}