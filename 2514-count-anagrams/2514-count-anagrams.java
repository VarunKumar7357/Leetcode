class Solution {
     static final long MOD = 1000000007L;
    public int countAnagrams(String s) {

        String[] str =  s.split(" ");
        long[] sum= new long[str.length];
        int j=0;

        for(int i=0;i<str.length;i++){
              long b= permutation(str[i]);
              sum[j++]=b;
        }
        long per = 1;
        for (int a = 0; a < sum.length; a++) {
            per = (per * sum[a]) % MOD;
        }

        return (int) per;
        
    }
    public long permutation(String str){
        char[] ch= str.toCharArray();
        Arrays.sort(ch);
        int c=1;
        long denominator = 1;
        for(int i=1;i<ch.length;i++){
             if(ch[i]==ch[i-1]){
                c++;
             }
             else {
                denominator = (denominator * factorial(c)) % MOD;
                c = 1; 
            }
        }
        denominator = (denominator * factorial(c)) % MOD;

        return (factorial(str.length()) * modInverse(denominator)) % MOD;

    }
    public long factorial(int t){

        long res = 1;
        for (int i = 2; i <= t; i++) {
            res = (res * i) % MOD;
        }
        return res;
    }
     private long modInverse(long a) {
        long res = 1;
        long exp = MOD - 2;
        while (exp > 0) {
            if ((exp & 1) == 1) res = (res * a) % MOD;
            a = (a * a) % MOD;
            exp >>= 1;
        }
        return res;
    }
}