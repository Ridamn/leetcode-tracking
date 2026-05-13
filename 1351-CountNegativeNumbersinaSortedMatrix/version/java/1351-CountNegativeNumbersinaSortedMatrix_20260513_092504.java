// Last updated: 5/13/2026, 9:25:04 AM
1class Solution {
2    public int countNegatives(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int c = 0;
6
7        int i = 0, j = n-1;
8        while(i < m && j >= 0){
9            if(grid[i][j] < 0){
10                c += (m-i);
11                j--;
12            }
13            else{
14                i++;
15            }
16        }
17        return c;
18    }
19}