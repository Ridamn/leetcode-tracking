// Last updated: 6/17/2026, 8:43:41 AM
class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<k; i++){
            sb.append(arr[i]);
            if(i != k-1){
                sb.append(" ");
            }
        }
        

        return sb.toString();
    }
}