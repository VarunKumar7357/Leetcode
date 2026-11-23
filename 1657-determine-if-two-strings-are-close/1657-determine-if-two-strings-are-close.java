class Solution {
    public boolean closeStrings(String word1, String word2) {

        if(word1.length()!=word2.length()){
            return false;
        }

        int[] ar= new int[26];
        int[] arr= new int[26];
        for(int i=0;i<word2.length();i++){
            ar[word1.charAt(i)-'a']++;
            arr[word2.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
           if(ar[i]>0 && !(arr[i]>0)){
               return false;
           }  
        }
        
        Arrays.sort(ar);
        Arrays.sort(arr);

        return Arrays.equals(ar,arr);
        
    }
}