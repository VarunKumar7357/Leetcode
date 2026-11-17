class Solution {
    public int[][] generateMatrix(int n) {

        int[][] res= new int[n][n];

        int c=1;
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;

        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                res[top][j]=c;
                c++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                res[i][right]=c;
                c++;
            }
            right--;
            if(top<=bottom){
            for(int j=right; j>=left;j--){
                res[bottom][j]=c;
                c++;
            }
             bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    res[i][left]=c;
                    c++;
                }
                left++;
            }
        }
        return res;
    }
}