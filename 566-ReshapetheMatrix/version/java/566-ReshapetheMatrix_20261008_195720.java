// Last updated: 10/8/2026, 7:57:20 PM
1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3        if(mat.length*mat[0].length != r*c) return mat;
4        int[][] newMat = new int[r][c];
5
6        int n=0;
7        for(int i=0; i<mat.length; i++){
8            for(int j=0; j<mat[0].length; j++){
9                newMat[n/c][n%c] = mat[i][j];
10                n++;
11            }
12        }
13        return newMat;
14    }
15}