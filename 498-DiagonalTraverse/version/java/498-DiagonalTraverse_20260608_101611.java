// Last updated: 6/8/2026, 10:16:11 AM
1class Solution {
2    public int[] findDiagonalOrder(int[][] mat) {
3
4        int m = mat.length;
5        int n = mat[0].length;
6
7        int[] arr = new int[n*m];
8
9        int row=0;
10        int col=0;
11
12        for(int i=0; i<m*n; i++){
13            arr[i] = mat[row][col];
14
15            if((row + col) % 2 == 0){
16                if(col == n-1) row++;
17                else if(row == 0) col++;
18                else {
19                    row--;
20                    col++;
21                }
22            }
23
24            else{
25                if(row == m-1) col++;
26                else if(col == 0) row++;
27                else{
28                    row++;
29                    col--;
30                }
31            }
32        }
33        return arr;
34    }
35}