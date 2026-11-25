class Solution {
    public int numSplits(String s) {
        int[] leftfreq= new int[26];
        int[] rightfreq= new int[26];

        int leftunique=0;
        int rightunique=0;
        int goodSplits=0;

        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';

            if(rightfreq[idx]==0){
                rightunique++;
            }
           rightfreq[idx]++;
        }

        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';

            if(leftfreq[idx]==0){
                leftunique++;
            }
           leftfreq[idx]++;

           rightfreq[idx]--;

           if(rightfreq[idx]==0){
              rightunique--;
           }

           if(leftunique==rightunique){
            goodSplits++;
           }
        }
        return goodSplits;
    }
}