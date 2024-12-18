class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0) {
            return new int[]{};
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for(int i = 0; i < arr.length; i++) {
            pq.offer(new int[]{i, arr[i]});
        }
        int prev[] = pq.poll(), rank = 1;
        int res[] = new int[arr.length];
        res[prev[0]] = rank;
        while(!pq.isEmpty()) {
            int curr[] = pq.poll();
            if(curr[1] == prev[1]) {
                res[curr[0]] = rank;
            }
            else {
                res[curr[0]] = ++rank;
            }
            prev = curr;
        }
        return res;
    }
}