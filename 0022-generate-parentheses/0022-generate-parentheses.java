class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res= new ArrayList<>();

        helper(n,n, new StringBuilder() );
        return res;
    }

    public void helper(int left, int right, StringBuilder sb){
        if( left==0 && right==0){
            res.add(new String(sb.toString()));
            return;
        }
         if (left > 0) {
            sb.append('(');
            helper(left - 1, right, sb);
            sb.deleteCharAt(sb.length() - 1); 
        }
          if (right > left) {
            sb.append(')');
            helper(left, right - 1, sb);
            sb.deleteCharAt(sb.length() - 1); // Backtrack
        }
        
    }
}