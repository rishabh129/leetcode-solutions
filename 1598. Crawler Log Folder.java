// Solution 1
class Solution {
    public int minOperations(String[] logs) {
        int steps=0;

        for(String log:logs){

            if(log.charAt(0)=='.'){

                if(log.charAt(1)=='.'){
                    if(steps!=0){
                        steps-=1;
                    }
                }

            }
            else{
                steps+=1;
            }
        }
        return steps;
    }
}

// Solution 2
class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();

        for(String s:logs){

            switch(s){
                case "../":
                if(!stack.isEmpty()){
                    stack.pop();
                }
                break;

                case "./":
                break;

                default:
                stack.push(s);
                break;
            }

        }

        return stack.size();
    }
}