// Last updated: 11/15/2026, 11:41:29 PM
1import java.util.Stack;
2
3class BrowserHistory {
4    Stack<String> stk1;
5    Stack<String> stk2;
6
7    public BrowserHistory(String homepage) {
8        stk1 = new Stack<>();
9        stk2 = new Stack<>();
10
11        stk1.push(homepage);
12    }
13
14    public void visit(String url) {
15        stk2.clear();
16        stk1.push(url);
17    }
18
19    public String back(int steps) {
20        for (int i = 0; i < steps && stk1.size() > 1; i++) {
21            stk2.push(stk1.pop());
22        }
23
24        return stk1.peek();
25    }
26
27    public String forward(int steps) {
28        for (int i = 0; i < steps && !stk2.isEmpty(); i++) {
29            stk1.push(stk2.pop());
30        }
31
32        return stk1.peek();
33    }
34}
35
36/**
37 * Your BrowserHistory object will be instantiated and called as such:
38 * BrowserHistory obj = new BrowserHistory(homepage);
39 * obj.visit(url);
40 * String param_2 = obj.back(steps);
41 * String param_3 = obj.forward(steps);
42 */