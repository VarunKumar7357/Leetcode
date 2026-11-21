class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int maxsum=nums[0];
        int curmax=0;
        int curmin=0;
        int minsum=nums[0];

        for(int num:nums){

            curmin=Math.min(num,num+curmin);
            minsum=Math.min(minsum,curmin);

            curmax=Math.max(num,num+curmax);
            maxsum=Math.max(maxsum,curmax);
            total+=num;
        }
        if(maxsum<0){
           return maxsum;
        }

        return Math.max(maxsum,total-minsum);
    }
}