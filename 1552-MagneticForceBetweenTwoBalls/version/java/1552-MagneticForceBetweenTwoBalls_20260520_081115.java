// Last updated: 5/20/2026, 8:11:15 AM
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int low = 1;
        int high = position[position.length - 1] - position[0];
        int ans = 0;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(canPlace(position, m, mid)) {
                ans = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }

        return ans;
    }

    public boolean canPlace(int[] arr, int m, int gap) {
        int last = arr[0];
        int cnt = 1;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] - last >= gap) {
                cnt++;
                last = arr[i];
            }
        }

        return cnt >= m;
    }
}