class MyStack {

    public MyStack() {
        
    }
    Queue<Integer> q1 = new LinkedList<>();
    // Queue<Integer> q2 = new LinkedList<>();
    // int top=0;
    public void push(int x) {
        q1.add(x);
        for(int i=0;i<q1.size()-1;i++){
            q1.add(q1.peek());
            q1.remove();    
        }
    }
    
    public int pop() {
        return q1.remove();
        // while(q1.size()!=1){
        //     q2.add(q1.remove());
        // }
//         Queue<Integer> temp = q1;
//         q1 = q2;
//         q2 = temp;
        
//         int top_ele = q1.remove();
     
//         return top_ele;
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
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