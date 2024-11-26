class Solution {
    public int findChampion(int n, int[][] edges) {
        int indegree[] = new int[n];
        for(int edge[]: edges) {
            indegree[edge[1]]++;
        }
        int res = 0, c = 0;
        for(int i = 0; i < n; i++) {
            if(indegree[i] == 0) {
                res = i;
                c++;
            }
        }
        if(c == 1) {
            return res;
        }
        return -1;
    }
}