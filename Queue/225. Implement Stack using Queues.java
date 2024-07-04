// Solution 1 - using 2 queue

class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        int temp=-1;
        while(!q1.isEmpty()){
            temp = q1.remove();
            if(q1.isEmpty()){
                break;
            }
            q2.add(temp);
        }

        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        return temp;
    }
    
    public int top() {
        int temp=-1;
        while(!q1.isEmpty()){
            temp = q1.remove();
            q2.add(temp);
        }

        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        return temp;
    }
    
    public boolean empty() {
        if(q1.isEmpty())
        return true;

        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

// Solution 2 - using only one queue

class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);

        for(int i=1;i<q.size();i++){
            q.add(q.remove());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */