// Last updated: 6/20/2026, 2:01:57 PM
1class Solution {
2
3    public char[][] rotateTheBox(char[][] box) {
4        for(int i=0; i<box.length; i++){
5            fall(box[i]);
6        }
7        return rotate(box);
8    }
9
10    public void fall(char[] arr){
11        int e = arr.length - 1;
12
13        for(int i = arr.length - 1; i >= 0; i--){
14            if(arr[i] == '*'){
15                e = i - 1;
16            }
17            else if(arr[i] == '#'){
18                arr[i] = '.';
19                arr[e] = '#';
20                e--;
21            }
22        }
23    }
24    public char[][] rotate(char[][] arr){
25        int n = arr.length;
26        int m = arr[0].length;
27
28        char[][] ans = new char[m][n];
29
30        for(int i=0; i<n; i++){
31            for(int j=0; j<m; j++){
32                ans[j][n-i-1] = arr[i][j];
33            }
34        }
35        return ans;
36    }
37}