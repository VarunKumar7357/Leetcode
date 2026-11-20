class Solution {
    public int calculate(String s) {

      Deque<Integer> stack= new ArrayDeque();
      int currNum=0;
      char oper='+';

      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);

        if(Character.isDigit(c)){
            currNum= (currNum * 10)+(c-'0');
        }

        if(!Character.isDigit(c) && s.charAt(i)!=' ' || i==s.length()-1){
            if(oper =='+'){
                stack.push(currNum);
            }
            if(oper =='-'){
                stack.push(-currNum);
            }
            if(oper =='*'){
                stack.push(stack.pop()*currNum);
            }
            if(oper =='/'){
                stack.push(stack.pop()/currNum);
            }

            oper=c;
            currNum=0;
        }
      }
      int result = 0;
        while(!stack.isEmpty()) {
            result+= stack.pop();
        }
        return result;    
    }
}