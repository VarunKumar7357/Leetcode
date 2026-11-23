class Solution {
    public int maxVowels(String s, int k) {

       List<Character> list= List.of('a', 'e', 'i', 'o', 'u');

       int maxc=0;

       for(int i=0;i<k;i++){
        if(list.contains(s.charAt(i))){
            maxc++;
        }
       }
       int p1=0;
       int p2=k;
       int curc=maxc;

       while(p2<s.length()){
          if(list.contains(s.charAt(p2))){
                 curc++;
          }
          if(list.contains(s.charAt(p1))){
                curc--;
          }
          maxc=Math.max(maxc,curc);
          p1++;
          p2++;
       }
        return maxc;
    }
}