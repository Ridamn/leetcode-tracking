// Last updated: 5/11/2026, 9:53:17 AM
class Solution {
    public int[] bestTower(int[][] t, int[] c, int r) {
        int bq = -1, bx = -1, by = -1;
        for (int[] a : t) {
            int d = Math.abs(a[0] - c[0]) + Math.abs(a[1] - c[1]);
            if (d > r) continue;
            if (a[2] > bq || (a[2] == bq && (bx == -1 || a[0] < bx || (a[0] == bx && a[1] < by)))) {
                bq = a[2];
                bx = a[0];
                by = a[1];
            }
        }
        return new int[]{bx, by};
    }
}
