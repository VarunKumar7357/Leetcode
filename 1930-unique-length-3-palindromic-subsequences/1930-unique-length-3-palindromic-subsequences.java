class Solution {
    public int countPalindromicSubsequence(String s) {

        int[] first= new int[26];
        int[] last= new int[26];
        Arrays.fill(first,-1);

        for(int i=0;i<s.length();i++){
            int ch= s.charAt(i)-'a';
            if(first[ch]==-1){
               first[ch]=i;
            }
            last[ch]=i;
        }
        
        int totaluniquepalindrome=0;

        for(int i=0;i<26;i++){
            if(first[i]!=-1 && first[i]<last[i]){
                boolean[] seen= new boolean[26];
                for(int j=first[i]+1;j<last[i];j++){
                    seen[s.charAt(j)-'a']=true;
                }
                for(boolean exists: seen){
                    if(exists){
                        totaluniquepalindrome+=1;
                    }
                }
            }
        }
        return totaluniquepalindrome;
    }
}