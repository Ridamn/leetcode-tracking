// Last updated: 5/11/2026, 9:57:01 AM
class Solution {
    public int totalFruit(int[] arr) {
        int max = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int i=0;
        int j=0;
        while(j<arr.length){
            mp.put(arr[j], mp.getOrDefault(arr[j], 0)+1);

            while(mp.size() >= 3){
                mp.put(arr[i], mp.get(arr[i])-1);
                if(mp.get(arr[i]) == 0){
                    mp.remove(arr[i]);
                }
                i++;
            }
            int c = j-i+1;
            max = Math.max(max, c);
            j++;
        }
        return max;
    }
}