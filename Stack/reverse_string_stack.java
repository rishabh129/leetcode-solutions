import java.util.*;

class reverse_string_stack{

    public static void main(String ar[]){
        Stack<Character> stack = new Stack<>();
        String str = "Hello";
        for(int i=0; i<str.length(); i++){
            stack.push(str.charAt(i));
        }
        String rev = "";
        while(!stack.isEmpty()){
            rev += stack.pop();
        }
        System.out.println(rev);
    }

}