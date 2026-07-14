class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length,column = matrix[0].length;
        int left=0,right=(row*column)-1,mid;
        int r,c;
        while(left<=right){
            mid = (left+right)/2;
            r = (mid/column);
            c = (mid%column);
            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
    return false;
    }
}