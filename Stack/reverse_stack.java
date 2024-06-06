//reverse stack without using extra space

import java.util.Stack;

public class reverse_stack {
    
    private static void insertAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int temp = stack.pop();
        insertAtBottom(stack, data);
        stack.push(temp);
    }

    private static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int temp = stack.pop();
        reverse(stack);
        insertAtBottom(stack, temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        System.out.println("Stack before reversing: " + stack);
        reverse(stack);
        System.out.println("Stack after reversing: " + stack);
    }

}