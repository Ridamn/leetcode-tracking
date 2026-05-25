// Last updated: 5/25/2026, 11:29:48 AM
1class Pr{
2    int v;
3    int mi;
4    public Pr(int e,int  m) {
5        this.v = e;
6        this.mi = m;
7    }
8}
9
10class MinStack {
11    Stack<Pr> st;
12    public MinStack() {
13        st = new Stack<>();
14    }
15    
16    public void push(int val) {
17        int min;
18        if(st.isEmpty()){
19            min = val;
20        }
21        else{
22            min = Math.min(val,st.peek().mi);
23        }
24        st.push(new Pr(val, min));
25    }
26    
27    public void pop() {
28        st.pop();
29    }
30    
31    public int top() {
32        return st.peek().v;
33    }
34    
35    public int getMin() {
36        return this.st.peek().mi;
37    }
38}
39
40/**
41 * Your MinStack object will be instantiated and called as such:
42 * MinStack obj = new MinStack();
43 * obj.push(val);
44 * obj.pop();
45 * int param_3 = obj.top();
46 * int param_4 = obj.getMin();
47 */