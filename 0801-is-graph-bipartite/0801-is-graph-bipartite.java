class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<Integer> q = new LinkedList<>();
        int v = graph.length;
        int color[] = new int[v];
        Arrays.fill(color, -1);
        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (visited[i]) {
                continue;
            }
            color[i] = 0;
            q.offer(i);
            while (!q.isEmpty()) {
                int n = q.poll();
                if (visited[n]) {
                    continue;
                }
                visited[n] = true;
                int nbrs[] = graph[n];
                for (int nbr : nbrs) {
                    if (color[nbr] == color[n]) {
                        // System.out.println(color[n]  + " " + color[nbr]);
                        return false;
                    }
                    if(color[nbr] == -1) {
                        color[nbr] = 1 - color[n];
                    }
                    if(!visited[nbr])
                    q.offer(nbr);
                }
            }
        }
        return true;
    }
}