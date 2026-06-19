// Last updated: 6/19/2026, 8:51:20 AM
1class Solution {
2
3    public void queen(char[][] board, int row, int n, List<List<String>> ans){
4        if(row == n){
5            int c=0;
6            for(int i=0; i<n; i++){
7                for(int j=0; j<n; j++){
8                    if(board[i][j] == 'Q') c++;
9                }
10            }
11            if(c == n){
12                List<String> temp = new ArrayList<>();
13
14                for(int i = 0; i < n; i++){
15                temp.add(new String(board[i]));
16                }
17
18                ans.add(temp);
19            }
20
21            return;
22        }
23    
24
25        for(int j=0; j<n; j++){
26            if(isSafe(row, j, board, n)){
27                board[row][j] = 'Q';
28                queen(board, row + 1, n, ans);
29                board[row][j] = '.';
30            }
31        }
32    }
33
34    public boolean isSafe(int row, int j, char[][] ans, int n){
35        for(int i=row-1; i>=0; i--){
36            if(ans[i][j] == 'Q') return false;
37        }
38        int r=row-1;
39        int c=j-1;
40        while(r>=0 && c>=0){
41            if(ans[r][c] == 'Q') return false;
42            c--;
43            r--;
44        }
45        r=row-1;
46        c=j+1;
47        while(r>=0 && c<n){
48            if(ans[r][c] == 'Q') return false;
49            c++;
50            r--;
51        }
52        return true;
53    }
54
55    public List<List<String>> solveNQueens(int n) {
56        char[][] board = new char[n][n];
57        for(int i=0; i<n; i++){
58            for(int j=0; j<n; j++){
59                board[i][j] = '.';
60            }
61        }
62        
63        List<List<String>> ans = new ArrayList<>();
64        for(int i=0; i<n; i++){
65            queen(board, i, n, ans);
66        }
67        return ans;
68    }
69}