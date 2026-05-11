// Last updated: 5/11/2026, 9:53:53 AM
class Solution {
    public long maxPoints(int[] technique1, int[] technique2, int k) {
        
        int n = technique1.length;
        long base = 0;
        
        for (int i = 0; i < n; i++) base += technique2[i];
        
        long[] d = new long[n];
        for (int i = 0; i < n; i++) d[i] = (long) technique1[i] - technique2[i];
        Arrays.sort(d);
        long add = 0;
        int r = n - 1;
        
        for (int t = 0; t < k; t++) {
            add += d[r--];
        }
        
        
        for (int i = r; i >= 0; i--) {
            if (d[i] > 0) add += d[i];
            else break;
        }
        return base + add;
   
    
    }
}





