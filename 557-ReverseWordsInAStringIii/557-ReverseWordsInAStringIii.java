// Last updated: 5/11/2026, 9:57:31 AM
class Solution {
    public String reverseWords(String s) {
        
        String[] arr = s.split(" ");

        
        for (int i = 0; i < arr.length; i++) {
            char[] arr2 = arr[i].toCharArray();
            int p1 = 0;
            int p2 = arr2.length - 1;

            while (p1 < p2) {
                char temp = arr2[p1];
                arr2[p1] = arr2[p2];
                arr2[p2] = temp;
                p1++;
                p2--;
            }

            
            arr[i] = new String(arr2);
        }

        
        return String.join(" ", arr);
    }
}
