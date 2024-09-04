class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        for(int i=0;i<len;i++){

            char curr = s.charAt(i);
            if(curr == '('){
                if(stack.size() > 0){
                    ans+=curr;
                }
                stack.push(curr);
            }
            else{
                stack.pop();
                if(stack.size() > 0){
                    ans += curr;
                }
            }

        }
    return ans;
    }
}