// Last updated: 5/14/2026, 9:01:30 AM
1class Solution {
2
3    // public boolean search(int[] arr, int k){
4    //     int p1 = 0;
5    //     int p2 = arr.length;
6
7    //     while(p1<p2){
8    //         int mid = p1 + (p2-p1)/2;
9
10    //         if(arr[mid] == k) return true;
11    //         else if(arr[mid] > k) p1 = mid+1;
12    //         else p2 = mid - 1;
13    //     }
14    //     return false;
15    // }
16
17    public boolean searchMatrix(int[][] mat, int target) {
18        int n = mat.length;
19        int m = mat[0].length;
20        int p1 = 0;
21        int p2 = m*n-1;
22        // int ans = -1;
23
24        while(p1<=p2){
25            int mid = p1 + (p2-p1)/2;
26            int c = mat[mid/m][mid%m];
27
28            if(c == target) return true;
29
30            else if(c < target){
31                // ans = mid;
32                p1 = mid + 1;
33            }
34            else p2 = mid - 1;
35        }
36
37        return false;
38
39        // return search(mat[ans], target);
40    }
41}