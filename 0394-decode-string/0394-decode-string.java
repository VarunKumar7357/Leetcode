class Solution {
    public String decodeString(String s) {
        Deque<Integer> countstack= new ArrayDeque<>();
        Deque<StringBuilder> stringstack= new ArrayDeque<>();

        StringBuilder current = new StringBuilder();
        int k=0;

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                k=k*10+(c-'0');
            }
            else if(c=='['){
                countstack.push(k);
                stringstack.push(current);

                current =new StringBuilder();
                k=0;
            }
            else if(c==']'){
                int repeateTimes=countstack.pop();
                StringBuilder decoded=stringstack.pop();

                for(int i=0;i<repeateTimes;i++){
                    decoded.append(current);
                }
                current =decoded;
            }
            else{
                current.append(c);
            }
        }
        return current.toString();
    }
}