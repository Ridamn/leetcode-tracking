// Last updated: 6/2/2026, 9:45:32 AM
1class StockSpanner {
2    class Pr{
3        int a;
4        int b;
5        Pr(int a, int b){
6            this.a = a;
7            this.b = b;
8        }
9    }
10
11    Stack<Pr> st;
12
13    public StockSpanner() {
14        st = new Stack<>();
15    }
16    
17    public int next(int price) {
18        int c=1;
19        while(!st.isEmpty() && st.peek().a <= price){
20            c += st.peek().b;
21            st.pop();
22        }
23        st.push(new Pr(price, c));
24
25        return c;
26    }
27}
28
29/**
30 * Your StockSpanner object will be instantiated and called as such:
31 * StockSpanner obj = new StockSpanner();
32 * int param_1 = obj.next(price);
33 */