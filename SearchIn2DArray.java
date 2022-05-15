
// Time Complexity : O(m +n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES

public class SearchIn2DArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0]. length;
        int i =0;
        int j = n-1;
        while(i < m && j >=0){
            if(matrix[i][j] == target)
                return true;
            if(matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}