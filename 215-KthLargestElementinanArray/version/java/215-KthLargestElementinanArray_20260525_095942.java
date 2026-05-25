// Last updated: 5/25/2026, 9:59:42 AM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>();
4
5        for(int i : nums){
6            pq.add(i);
7
8            if(pq.size() > k) pq.poll();
9        }
10        return pq.peek();
11    }
12}