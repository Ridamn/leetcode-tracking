// Last updated: 5/11/2026, 9:57:53 AM
class Solution {
    public String reverseVowels(String s) {
        String v = "AEIOUaeiou";
        char[] arr = s.toCharArray();

        int p1=0; 
        int p2=arr.length-1;
        while(p1<p2){
            while (p1 < p2 && v.indexOf(arr[p1]) == -1) {
            p1++;
            }

            while (p1 < p2 && v.indexOf(arr[p2]) == -1) {
            p2--;
            }

            char temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;

        }
        return new String(arr);

    }
}