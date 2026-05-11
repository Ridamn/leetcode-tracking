// Last updated: 5/11/2026, 9:54:44 AM
class Solution {
    public int reverseDegree(String s) {
        int n=0;
        for(int i=0; i<s.length(); i++){
            //z = 122 , a = 97
            n += (i+1)*(123-s.charAt(i));


        }
        return n;
    }
}