class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {

        res= new ArrayList<>();
        res.add(new ArrayList<>());
        helper(0,nums, new ArrayList<>());
        return res;
    }

    public void helper( int length, int[] nums, List<Integer> list){

          if(length== nums.length){
            return;
          }
           
           for(int i=length;i<nums.length;i++){
              list.add(nums[i]);
              res.add(new ArrayList<>(list));
              helper( i+1,  nums,  list );
              list.remove(list.size()-1);
           }

    }
}