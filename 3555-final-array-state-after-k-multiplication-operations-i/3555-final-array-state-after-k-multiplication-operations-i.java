class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if(a[1] != b[1]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        for(int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{i, nums[i]});
        }
        while(k-- > 0) {
            int curr[] = pq.poll();
            curr[1] *= multiplier;
            pq.offer(curr);
        }
        while(pq.size() > 0) {
            int curr[] = pq.poll();
            nums[curr[0]] = curr[1];
        }
        return nums;
    }
}