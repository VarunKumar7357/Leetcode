class Solution {
    public int minSteps(String s, String t) {

        int[] freq= new int[26];
        int c=0;
        for(int i=0;i<s.length();i++){
               freq[s.charAt(i)-'a']++;
               freq[t.charAt(i)-'a']--;
        }

        for(int i:freq){
           if(i>0){
            c+=i;
           }
        }
        return c;
    }
}