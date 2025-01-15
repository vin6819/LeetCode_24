class Solution {
    class Pair {
        int vtx, dis;
        Pair(int vtx, int dis) {
            this.vtx = vtx;
            this.dis = dis;
        }
    }
    public boolean isBipartite(int[][] graph) {
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> visited = new HashMap<>();
        for(int vtx = 0; vtx < graph.length; vtx++) {
            if(visited.containsKey(vtx)) {
                continue;
            }
            q.add(new Pair(vtx, 0));
            while(!q.isEmpty()) {
                Pair p = q.poll();
                if(visited.containsKey(p.vtx)) {
                    if(visited.get(p.vtx) != p.dis) {
                        return false;
                    };
                    continue;
                }
                visited.put(p.vtx, p.dis);
                for(int nbr: graph[p.vtx]) {
                    if(!visited.containsKey(nbr)) {
                        q.add(new Pair(nbr, p.dis + 1));
                    }
                }
            }
        }
        return true;
    }
}