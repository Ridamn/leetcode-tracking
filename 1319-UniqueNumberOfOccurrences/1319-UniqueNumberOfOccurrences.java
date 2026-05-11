// Last updated: 5/11/2026, 9:56:40 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> dic = new HashMap<>();

        for(int i : arr){
            dic.put(i, dic.getOrDefault(i, 0)+1);
        }
        HashSet<Integer> freqSet = new HashSet<>();
        for (int freq : dic.values()) {
            if (freqSet.contains(freq)) {
                return false;  
            }
            freqSet.add(freq);
        }

        return true;
    }
}