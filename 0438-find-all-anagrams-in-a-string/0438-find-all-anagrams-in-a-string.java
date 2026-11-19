class Solution {
    public List<Integer> findAnagrams(String s, String p) {

     List<Integer> res= new ArrayList<>();
     int n=s.length();
     int k=p.length();

     if (k > n) return res;

     int[] pcount =new int[26];
     int[] wcount = new int[26];

     for(int i=0;i<p.length();i++){
        pcount[p.charAt(i)-'a']++;
        wcount[s.charAt(i)-'a']++;
     }
     if(Arrays.equals(pcount,wcount)){
        res.add(0);
     }
     for(int i=k;i<n;i++){
        wcount[s.charAt(i)-'a']++;
        wcount[s.charAt(i-k)-'a']--;
        if(Arrays.equals(pcount,wcount)){
            res.add(i-k+1);
        }
     }
     return res;
        
    }
}