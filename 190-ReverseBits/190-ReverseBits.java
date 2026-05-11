// Last updated: 5/11/2026, 9:58:38 AM
class Solution {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<32 ; i++){
            int r=n%2;
            if(r<0) r+=2;
            sb.append(r);
            n/=2;
        }
        return (int) Long.parseLong(sb.toString(),2);
    }
}