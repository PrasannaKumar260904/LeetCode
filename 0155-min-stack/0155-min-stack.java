class MinStack {
    Stack<Long> st=new Stack<>();
    Long mini;

    public MinStack() {
        mini=Long.MAX_VALUE;
        
    }
    
    public void push(int val) {
        Long x=Long.valueOf(val);
        if(st.isEmpty()){
            mini=x;
            st.push(x);
        }else{
            if(x<mini){
                st.push(2*x-mini);
                mini=x;
            }else{
                st.push(x);
            }
        }
        
    }
    
    public void pop() {
        if(st.isEmpty())return;
        Long top=st.pop();
        if(top<mini){
            mini=(2*mini-top);
        }
        
    }
    
    public int top() {
        Long val=st.peek();
        if(val<mini){
            return mini.intValue();
        }
        return val.intValue();
        

        
    }
    
    public int getMin() {
        return mini.intValue();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */