// using stack

class Solution {
    public boolean isValid(String s) {
        Stack<Character> open = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr == '['){
                open.push(curr);
            }
            else{
                if(open.isEmpty()){
                    return false;
                }
                if(curr == ')'){
                    if(open.peek() == '('){
                        open.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(curr == '}'){
                    if(open.peek() == '{'){
                        open.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    if(open.peek() == '['){
                        open.pop();
                    }
                    else{
                        return false;
                    }
                }
            }

        }
        if(open.isEmpty()){
            return true;
        }
        return false;
    }
}