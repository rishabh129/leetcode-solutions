// stack implementation as array list

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(int data) {
        stack.add(data);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}