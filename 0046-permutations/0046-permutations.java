class Solution {

    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res= new ArrayList<>();
        helper( nums, new ArrayList<>());
        return res;
    }
    public void helper(int[] nums,List<Integer> list ){

        if(list.size()==nums.length){
            if(!res.contains(list)){
            res.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
             list.add(nums[i]);
             helper( nums, list );
            list.remove(list.size()-1);
            }
        }
    }
}