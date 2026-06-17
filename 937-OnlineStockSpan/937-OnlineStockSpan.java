// Last updated: 6/17/2026, 8:44:50 AM
class StockSpanner {
    class Pr{
        int a;
        int b;
        Pr(int a, int b){
            this.a = a;
            this.b = b;
        }
    }

    Stack<Pr> st;

    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int c=1;
        while(!st.isEmpty() && st.peek().a <= price){
            c += st.peek().b;
            st.pop();
        }
        st.push(new Pr(price, c));

        return c;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */