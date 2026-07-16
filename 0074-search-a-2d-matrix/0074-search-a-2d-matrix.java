class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int ri=matrix[0].length*matrix.length-1;
        while(l<=ri){
            int mid=(l+ri)/2;
            int r=mid/matrix[0].length;
            int c=mid%matrix[0].length;
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]<target){
                l=mid+1;
            }else{
                ri=mid-1;
            }
        }
        return false;
    }
}