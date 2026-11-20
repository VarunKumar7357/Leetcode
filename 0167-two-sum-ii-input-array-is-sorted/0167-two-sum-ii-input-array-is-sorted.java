class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] num= new int[2];
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<numbers.length;i++){
               int a=numbers[i];

               if(map.containsKey(target-a)){
                num[0] = map.get(target - a) + 1;
                num[1] = i + 1;
                return num;
               }
               map.put(a,i);
        }

        return num;
        
    }
}