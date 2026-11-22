class Solution {
    public int removeDuplicates(int[] nums) {

        List<Integer> list= new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(i>=2 && (nums[i]==nums[i-2])){
                continue;
            }
            list.add(nums[i]);
        }
         for(int i=0;i<nums.length;i++){
            if(i>=list.size()){
                nums[i]=0;
            }else{
           nums[i]=list.get(i);
            }
        }
        return list.size();
    }
}