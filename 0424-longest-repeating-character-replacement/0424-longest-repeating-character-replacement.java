class Solution {
    public int characterReplacement(String s, int k) {
        
    int[] count=new int[26];
    int maxfreq=0;
    int best=0;
    int left=0;

    for(int right=0;right<s.length();right++){
        count[s.charAt(right)-'A']++;
        maxfreq = Math.max(maxfreq,count[s.charAt(right)-'A']);

        if((right-left+1)-maxfreq>k){
            count[s.charAt(left)-'A']--;
            left++;
        }
        best=Math.max(best,right-left+1);
    }
    return best;

    }
}