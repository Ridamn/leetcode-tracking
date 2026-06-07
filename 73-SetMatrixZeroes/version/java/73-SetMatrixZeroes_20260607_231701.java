// Last updated: 6/7/2026, 11:17:01 PM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        boolean row = false;
7        boolean col = false;
8
9        for(int i=0; i<n; i++) {
10            if(matrix[0][i] == 0){
11                row = true;
12                break;
13            }
14        }
15
16        for(int i=0; i<m; i++){
17            if(matrix[i][0]==0){
18                col=true;
19                break;
20            }
21        }
22
23        for(int i=1; i<m; i++){
24            for(int j=1; j<n; j++){
25                if(matrix[i][j] == 0){
26                    matrix[i][0] = 0;
27                    matrix[0][j] = 0;
28                }
29            }
30        }
31
32        for(int i=1; i<m; i++){
33            for(int j=1; j<n; j++){
34                if(matrix[i][0] == 0 || matrix[0][j] == 0){
35                    matrix[i][j] = 0;
36                }
37            }
38        }
39
40        if(row){
41            for(int j=0; j<n; j++){
42                matrix[0][j] = 0;
43            }
44        }
45
46        if(col){
47            for(int i=0; i<m; i++){
48                matrix[i][0] = 0;
49            }
50        }
51    }
52}