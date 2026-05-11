// Last updated: 5/11/2026, 9:56:18 AM
class Solution {
    public int maxWidthOfVerticalArea(int[][] p) {
        Arrays.sort(p, (a, b) -> Integer.compare(a[0], b[0]));

        int max = 0;
        for(int i=1; i<p.length; i++){
            int n = p[i][0] - p[i-1][0];
            max = Math.max(max, n);
        }
        return max;
    }
}