// Last updated: 5/11/2026, 9:58:14 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++){
            if(bs(matrix[i], target)) return true;
        }
        return false;
    }


    public boolean bs(int[] mat, int t){
        int p1 = 0;
        int p2 = mat.length-1;

        while(p1<=p2){
            int mid = p1+(p2-p1)/2;
            if(mat[mid] == t) return true;
            else if(mat[mid] < t){
                p1 = mid+1;
            }else p2 = mid-1;
        }
        return false;
    }
}