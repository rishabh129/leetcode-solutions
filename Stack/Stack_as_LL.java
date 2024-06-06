// Stack as Linked List

import java.util.LinkedList;

public class StackByLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node head;

        public Stack() {
            head = null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int data = head.data;
            head = head.next;
            return data;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

        public boolean isEmpty() {
            return head == null;
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}