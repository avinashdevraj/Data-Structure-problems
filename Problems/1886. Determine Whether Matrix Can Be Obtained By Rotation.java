// class Solution {
//     public boolean findRotation(int[][] mat, int[][] target) {
//         boolean possible=true;
//         for(int bari=1;bari<5;bari++){
//         rotate(mat,target);
//           int n=mat.length;
//         int m=mat[0].length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(mat[i][j]+" ");
//                 if(mat[i][j]!=target[i][j]) possible= false;
//             }
//             System.out.println();

//         }
//         if(possible) break;
//         if(possible==false && bari<4){
//             possible=true;
//         }
//         }
//         return possible;

//     }
//     public void rotate(int[][] mat,int[][] target){
//         int n=mat.length;
//         int m=mat[0].length;
//         for(int i=0;i<n;i++){
//             for(int j=i;j<m;j++){
//                 int x=mat[i][j];
//                 int y=mat[j][i];
//                 mat[i][j]=y;
//                 mat[j][i]=x;
//             }
//         }
//        for(int i=0;i<n;i++){
//         int l=0,r=m-1;
//         while(l<r){
//             int x=mat[i][l];
//             int y=mat[i][r];
//             mat[i][l]=y;
//             mat[i][r]=x;
//             l++;
//             r--;
//         }

//        }
//     }
// }



//                              SOLUTION-2

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        int n=mat.length;
        int c0_360=0,c90=0,c180=0,c270=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(target[i][j]==mat[n-1-j][i]){
                    c90++;
                }
                if(target[i][j]==mat[n-i-1][n-1-j]){
                    c180++;
                }
                if(target[i][j]==mat[j][n-i-1]){
                    c270++;
                }
                if(target[i][j]==mat[i][j]){
                    c0_360++;
                }
            }
        }
        if(c0_360==n*n || c90==n*n || c180==n*n || c270==n*n) return true;
        return false;

    }
}