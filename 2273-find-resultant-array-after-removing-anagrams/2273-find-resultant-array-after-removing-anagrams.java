class Solution {
    public List<String> removeAnagrams(String[] words) {

       List<String> list= new ArrayList<>();
       list.add(words[0]);
        
        for(int i=1;i<words.length;i++){

            if(words[i-1].length()!=words[i].length()){
                       list.add(words[i]);
            }
            else{
              int[] ar= new int[26];

              for(int j=0;j<words[i].length();j++){
                   ar[words[i].charAt(j)-'a']++;
                   ar[words[i-1].charAt(j)-'a']--;
              }
              boolean isAnagram=true;
              for(int z=0;z<26;z++){
                  if(ar[z]!=0){
                    isAnagram=false;
                  }
              }
              if(!isAnagram){
                list.add(words[i]);
              }
            }
        }
        return list;
    }
}