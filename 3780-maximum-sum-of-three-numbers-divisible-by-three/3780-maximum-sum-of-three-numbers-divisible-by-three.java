class Solution {
    public int maximumSum(int[] nums) {

      int[][] top= new int[3][3];
      for(int r=0;r<3;r++){
        Arrays.fill(top[r],-1);
      }

      for(int num:nums){
        int r=num%3;
        if(num>top[r][0]){
              top[r][2]=top[r][1];
              top[r][1]=top[r][0];
              top[r][0]=num;
        }
        else if(num>top[r][1]){
              top[r][2]=top[r][1];
              top[r][1]=num;
        }
         else if(num>top[r][2]){
              top[r][2]=num;
        }
      }

        int maxSum=0;

        for(int r=0;r<3;r++){
            if(top[r][2]!=-1){
                 maxSum = Math.max(maxSum, top[r][0]+ top[r][1] +top[r][2]);
            }
        }
        if (top[0][0] !=-1 && top[1][0] !=-1 && top[2][0] !=-1) {
            maxSum = Math.max(maxSum, top[0][0] +top[1][0] +top[2][0]);
        }

        return maxSum; 
    }
}