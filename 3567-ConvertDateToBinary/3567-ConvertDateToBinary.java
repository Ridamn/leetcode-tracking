// Last updated: 6/17/2026, 8:42:50 AM
class Solution {
    public String convertDateToBinary(String date) {
        String [] arr = date.split("-");
        StringBuilder sb = new StringBuilder();

        for(String i : arr){
            int n = Integer.parseInt(i);
            sb.append(Integer.toBinaryString(n));
            sb.append("-");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}