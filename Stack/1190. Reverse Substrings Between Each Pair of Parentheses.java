class Solution {
    public String reverseParentheses(String s) {
        
        Stack<Character> stack = new Stack<>();
        StringBuilder str= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch != ')'){
                stack.push(ch);
            }
            else{
                str.setLength(0);
                while(!stack.isEmpty() && stack.peek() !='('){
                    str.append(stack.pop());
                }
                stack.pop();
                for(int j=0;j<str.length();j++){
                    stack.push(str.charAt(j));
                }
            }
        }

        str.setLength(0);
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }

        
        return str.reverse().toString();
    }
}