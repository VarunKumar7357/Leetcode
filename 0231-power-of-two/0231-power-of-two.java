class Solution {
    public boolean isPowerOfTwo(int n) {
         if(n==2 || n==1){
            return true;
        }
        if(n%2==1 || n<1 ){
            return false;
        }
       

        return isPowerOfTwo( n/2);
    }
}