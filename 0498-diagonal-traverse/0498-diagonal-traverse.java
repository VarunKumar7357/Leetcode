class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0){
            return new int[0];
        }
        int n=mat.length;
        int m=mat[0].length;
        int[] ar=new int[n*m];
        boolean goingup= true;
        int row=0;
        int col=0;

        for(int i=0;i<m*n;i++){
         ar[i] = mat[row][col];
         if(goingup){
            if(col==m-1){
                row++;
                goingup=false;
            }
            else if(row==0){
                col++;
                goingup=false;
            }
            else{
                row--;
                col++;
            }
         }
         else{
             if(row==n-1){
                col++;
                goingup=true;
            }
            else if(col==0){
                row++;
                goingup=true;
            }
            else{
                row++;
                col--;
            }
         }

          
        }
        return ar;
    }
}