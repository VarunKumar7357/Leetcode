class Solution {
    public int minSteps(String s, String t) {

        int[] ar= new int[26];
        String str= (s.length()>t.length())? s:t;
        String str1= (s.length()>t.length())? t:s;
        int count=0;

        for(int i=0;i<str.length();i++){
            ar[str.charAt(i)-'a']++;
        }
          for(int i=0;i<str1.length();i++){
            ar[str1.charAt(i)-'a']--;
        }

        for(int j=0;j<26;j++){
            count += Math.abs(ar[j]);
        }
        return count;
    }
}