class Solution {
    public String frequencySort(String s) {
    
     int[] freq = new int[128];

     for(char ch:s.toCharArray()){
        freq[ch]++;
     }

     List<Character>[] buckets= new List[s.length()+1];

     for(int i=0;i<128;i++){
         if(freq[i]>0){
            int count=freq[i];
            if(buckets[count]==null){
                buckets[count]=new ArrayList<>();
            }
            buckets[count].add((char) i);
         }
     }

     StringBuilder sb= new StringBuilder();

     for(int i=buckets.length-1;i>0;i--){
           if(buckets[i]!=null){
            for(char c: buckets[i]){
                for(int j=0;j<i;j++){
                    sb.append(c);
                }
            }
           }
     }
      return sb.toString();
    }
}