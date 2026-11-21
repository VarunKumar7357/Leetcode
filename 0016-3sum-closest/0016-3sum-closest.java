class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closum=nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int cursum=nums[left]+nums[i]+nums[right];
                if(cursum==target){
                    return cursum;
                }
                if(Math.abs(target-cursum)<Math.abs(target-closum)){
                    closum=cursum;
                }
                if(cursum<target){
                    left++;
                }
                else{
                    right--; }
            }
        }
       return closum;
    }
}