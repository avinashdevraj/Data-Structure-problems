class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int a=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=a;
            }
        }
        for(int i=0;i<n;i++){
            int l=0,r=n-1;
            while(l<r){
                int a=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=a;
                l++;
                r--;
            }
        }

    }
}