// Last updated: 5/26/2026, 9:50:48 AM
1class StockSpanner {
2    // class Pr{
3    //     int p;
4    //     int s;
5
6    //     Pr(int p, int s){
7    //         this.p = p;
8    //         this.s = s;
9    //     }
10
11    // }
12
13    public Stack<int[]> st;
14
15    public StockSpanner() {
16        st = new Stack<>();
17    }
18    
19    public int next(int price) {
20        int c = 1;
21        while(!st.isEmpty() && st.peek()[0] <= price){
22            c += st.pop()[1];
23        }
24        st.push(new int[]{price, c});
25        
26        return c;
27    } 
28}
29
30/**
31 * Your StockSpanner object will be instantiated and called as such:
32 * StockSpanner obj = new StockSpanner();
33 * int param_1 = obj.next(price);
34 */