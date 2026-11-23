class Solution {
    public int minimumLength(String s) {

        int p1=0;
        int p2=s.length()-1;

        while(p1<p2 && s.charAt(p1)==s.charAt(p2)){
            int ch=s.charAt(p1);

                while(p1<=p2 && ch==s.charAt(p1)){
                    p1++;
                }
                while( p1<=p2 && ch==s.charAt(p2)){
                    p2--;
                }
        }
        return p2-p1+1;
    }
}