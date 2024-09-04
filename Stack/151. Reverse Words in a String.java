class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();

        int len = s.length();
        String str="";
        
        for(int i=0;i<len;i++){

            char curr = s.charAt(i);
            if(curr==' '){
                if(str=="")
                continue;
                stack.push(str);
                str="";
            }
            else{
                str+=curr;
            }

        }
        stack.push(str);
        str="";

        while(!stack.isEmpty()){

            str += stack.pop();
            if(!stack.isEmpty()){
                str+=' ';
            }

        }
        return str.trim();
    }
}