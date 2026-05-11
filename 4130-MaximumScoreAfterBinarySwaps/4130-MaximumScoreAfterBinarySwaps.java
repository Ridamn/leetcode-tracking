// Last updated: 5/11/2026, 9:53:40 AM
class Solution {
    public long maximumScore(int[] nums, String s) {
        int[] arr = nums;

        int n = nums.length;
        List<Integer> pos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') pos.add(i);
        }

        int k = pos.size();
        if (k == 0) return 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum = 0;
        int j = k - 1;

        for (int i = n - 1; i >= 0; i--) {
            while (j >= 0 && pos.get(j) >= i) {
                j--;
            }
            if (k - 1 - j > pq.size()) {
                pq.offer(arr[i]);
                sum += arr[i];
            } else if (!pq.isEmpty() && pq.peek() < arr[i]) {
                sum += arr[i] - pq.poll();
                pq.offer(arr[i]);
            }
        }

        return sum;
    }
}
