class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n= nums.length;
        if(nums.length==0 || nums.length==1){
            return 0;
        }

        int max=nums[0];
        int min=nums[n-1];

        int end=-2;
        int start=-1;

        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);

            if(nums[i]<max){
                end=i;
            }
            int ridx=n-i-1;
            min=Math.min(min,nums[ridx]);
            if(nums[ridx]>min){
                start=ridx;
            }
        }

        return end-start+1;

        
    }
}