class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int curmax=0;
        int maxsum=nums[0];
        int curmin=0;
        int minsum=0;

        for(int i=0;i<nums.length;i++){

             curmax=Math.max(nums[i],curmax+nums[i]);
             maxsum=Math.max(maxsum,curmax);

             curmin=Math.min(nums[i],curmin+nums[i]);
             minsum=Math.min(minsum,curmin);

        }

        return Math.max(maxsum,Math.abs(minsum));
        
    }
}