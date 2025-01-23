class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int in[] = new int[numCourses];
        int res[] = new int[numCourses];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i[]: prerequisites) {
            map.get(i[1]).add(i[0]);
            in[i[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (in[i] == 0) {
                q.offer(i);
            }
        }
        int c = 0;
        while (!q.isEmpty()) {
            int r = q.poll();
            res[c++] = r;
            for (int nbr: map.get(r)) {
                in[nbr]--;
                if (in[nbr] == 0) {
                    q.offer(nbr);
                }
            }
        }
        if (c == numCourses) {
            return res;
        }
        else {
            return new int[]{};
        }
    }
}