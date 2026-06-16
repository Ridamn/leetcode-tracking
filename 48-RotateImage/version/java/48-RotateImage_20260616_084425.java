// Last updated: 6/16/2026, 8:44:25 AM
1class Solution {
2    public void rotate(int[][] mat) {
3        int n=mat.length;
4        for (int i = 0; i < n / 2; i++) {
5            for (int j = i; j < n - i - 1; j++){
6                int temp = mat[i][j];
7                mat[i][j] = mat[n-1-j][i];
8                mat[n-1-j][i] = mat[n-1-i][n-1-j];
9                mat[n-1-i][n-1-j] = mat[j][n-1-i];
10                mat[j][n-1-i] = temp;
11            }
12        }
13    }
14}