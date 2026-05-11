// Last updated: 5/11/2026, 9:58:53 AM
class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        String[] arr = s.split("\\s+"); 
        int p1=0;
        int p2=arr.length-1;
        while(p1<=p2){
            String temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
        }
        return String.join(" ", arr).trim();

    }
}