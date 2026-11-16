class Solution {
    public int dominantIndex(int[] nums) {
        int n= nums.length;
        int is=-1;
        int l=0;
        
        for(int j=0;j<n;j++){
           if(nums[j]>l){
            l=nums[j];
            is=j;
           }
        }
        for(int i=0;i<n;i++){
            if(2*nums[i]<=l ){
                continue;
            }
            if(2*nums[i]>l && nums[i]!=l){
                return -1;
            }
            
        }
        return is;
    }
        
    }
