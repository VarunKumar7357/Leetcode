class Solution {
    public boolean checkInclusion(String s1, String s2) {

      if(s1.length()>s2.length()) return false;

      int[] s11= new int[26];
      int[] s22= new int[26];

      for(int i=0;i<s1.length();i++){
          s11[s1.charAt(i)-'a']++;
          s22[s2.charAt(i)-'a']++;
      }
      if(Arrays.equals(s11,s22)) return true;
      int p1=0;
      for(int i=s1.length();i<s2.length();i++){
            s22[s2.charAt(i)-'a']++;
            s22[s2.charAt(p1)-'a']--;
            p1++;

            if(Arrays.equals(s11,s22)){
                return true;
            }
      }
      return false;
    }
}