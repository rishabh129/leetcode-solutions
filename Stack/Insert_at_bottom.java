// using recursion

import java.util.Stack;

public class Insert_at_bottom {
    
    private static void insertAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int temp = stack.pop();
        insertAtBottom(stack, data);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        System.out.println("Stack before inserting at bottom: " + stack);
        insertAtBottom(stack, 4);
        System.out.println("Stack after inserting at bottom: " + stack);
    }

}