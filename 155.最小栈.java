import java.util.Stack;

class MinStack {

    /** initialize your data structure here. */
    public MinStack() {
        
    }
    private Stack<Integer> dataStack = new Stack<>();
    private int min = Integer.MAX_VALUE;
    
    public void push(int x) {
        
        if(x <= min){
            dataStack.push(min);
            min = x;
        }
        dataStack.push(x);
    }
    
    public void pop() {
        if(dataStack.pop()==min){
            min = dataStack.pop();
        }
    }
    
    public int top() {
        return dataStack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */