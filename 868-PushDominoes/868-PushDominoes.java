// Last updated: 6/17/2026, 8:44:59 AM
class Solution {
    public String pushDominoes(String dominoes) {
        int n= dominoes.length();
        int c=0;

        int[] right = new int[n];
        int[] left = new int[n];

        for(int i=n-1; i>=0; i--){
            if(dominoes.charAt(i)=='L'){
                c=n;
                left[i]=c;
            }
            else if(dominoes.charAt(i)=='R'){
                c=0;
                left[i]=0;
            }
            else{
                c=Math.max(c-1,0);
                left[i]=c;
            }
        }
        c=0;
        for(int i=0; i<n; i++){
            if(dominoes.charAt(i)=='R'){
                c=n;
                right[i]=c;
            }
            else if(dominoes.charAt(i)=='L'){
                c=0;
                right[i]=0;
            }
            else{
                c=Math.max(c-1,0);
                right[i]=c;
            }
        }
    
        System.out.println("left: " + Arrays.toString(left));
        System.out.println("right: "+ Arrays.toString(right));

        StringBuilder s = new StringBuilder();
        for(int i=0; i<n; i++){
            if(left[i] > right[i]) s.append("L");
            else if(left[i] < right[i]) s.append("R");
            else s.append(".");
        }
        return s.toString();
    }
}