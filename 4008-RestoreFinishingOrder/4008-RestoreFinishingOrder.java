// Last updated: 5/11/2026, 9:54:07 AM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for(int i : friends){
            set.add(i);
        }
        List<Integer> arr = new ArrayList<>();
        for(int i : order){
            if(set.contains(i)) arr.add(i);
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}