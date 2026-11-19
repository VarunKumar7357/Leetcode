class Solution {
    public int beautySum(String s) {
       int count=0;

        for(int i=0;i<s.length();i++){
             int[] res= new int[26];
            for(int j=i;j<s.length();j++){
                int idx=s.charAt(j)-'a';
                res[idx]+=1;
                 count+= beauty(res );
            }
        }
        return count;
    }
     public int beauty(int[] res){
             int max=0;
             int min=Integer.MAX_VALUE;
             for(int i:res){
                
                 if(i>0){
                    max = Math.max(max, i);
                    min = Math.min(min, i);
                 }
             }

             return max-min;
     }
}