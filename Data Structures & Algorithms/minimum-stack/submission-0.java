class MinStack {
    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        
    }
    
    public void pop() {
        stack.pop();
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        Stack<Integer> abc = new Stack<>();
        int m = stack.peek();

        while(!stack.isEmpty()){
            m=Math.min(m,stack.peek());
            abc.push(stack.pop());
        }

        while(!abc.isEmpty()){
            stack.push(abc.pop());
        }
        return m;
        
        
    }
}
