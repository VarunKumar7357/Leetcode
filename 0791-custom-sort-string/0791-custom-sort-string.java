class Solution {
    public String customSortString(String order, String s) {

        int[] ar= new int[26];
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<s.length();i++){
            ar[s.charAt(i)-'a']++;
        }

        for(int i=0;i<order.length();i++){
            while(ar[order.charAt(i)-'a']>0){
                ar[order.charAt(i)-'a']--;
                sb.append(order.charAt(i));
            }
        }
        for(int i=0;i<26;i++){
            int p1= ar[i];
            while(p1>0){
                 sb.append((char)(i+'a'));
                 p1--;
            }
        }
        return sb.toString();
    }
}