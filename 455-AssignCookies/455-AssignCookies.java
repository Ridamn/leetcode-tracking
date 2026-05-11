// Last updated: 5/11/2026, 9:57:38 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length == 0 || s.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0;
        int p1=0;
        int p2=0;
        while(p1<g.length && p2<s.length){
            if(s[p2] >= g[p1]){
                c++;
                p1++;
            }
            p2++;
        }
        return c;
    }
}