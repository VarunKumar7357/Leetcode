class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
        res= new ArrayList<>();
        res.add(new ArrayList<>());
        helper(0,nums, new ArrayList<>() );

        return res;
    }
    public void helper(int start, int[] nums, List<Integer> list){
        if(start==nums.length){
            return;
        }

        for(int i=start; i<nums.length;i++){
            list.add(nums[i]);
            if(!res.contains(list)){
            res.add(new ArrayList<>(list));
            }
            helper(i+1, nums, list);
            list.remove(list.size()-1);
        }
    }
}