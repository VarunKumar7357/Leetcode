class Solution {
    public boolean checkIfPangram(String sentence) {

         boolean[] isseen= new boolean[26];
           int c=0;

           for(int i=0;i<sentence.length();i++){
               char ch = sentence.charAt(i);
               if(ch>='A' && ch<='Z'){
                    ch=(char)(ch+32);
               }
               if(ch>='a' && ch<='z'){
                   int index=ch-'a';

                   if(!isseen[index]){
                       isseen[index]=true;
                       c++;
                   }
               }
           }
           if(c==26){
            return true;
           }
           else{
            return false;
           }
        
    }
}