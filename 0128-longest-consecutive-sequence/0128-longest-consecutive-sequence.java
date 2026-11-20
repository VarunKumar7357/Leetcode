class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0 ){
            return 0;
        }

        Set<Integer> set= new HashSet<>();
        int c=0;

        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
           if(!set.contains(num-1)){
               int curc=1;
               int curNum=num;
               while(set.contains(curNum+1)){
                curc++;
                curNum++;
               }

               c=Math.max(curc,c);
           }
        }
        

        return c;
        
    }
}