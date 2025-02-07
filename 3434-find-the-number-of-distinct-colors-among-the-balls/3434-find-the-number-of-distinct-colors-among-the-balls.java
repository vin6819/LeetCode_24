class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> colorCount = new HashMap<>();
        int[] ans = new int[queries.length];
        int distinctColors = 0;
        for(int i=0;i<queries.length;i++){
            int ball = queries[i][0];
            int color = queries[i][1];
            if(map.containsKey(ball)){
                int oldcolor = map.get(ball);
                colorCount.put(oldcolor,colorCount.get(oldcolor)-1);
                if(colorCount.get(oldcolor)==0){
                    colorCount.remove(oldcolor);
                    distinctColors--;
                }
            }
            map.put(ball,color);
            colorCount.put(color,colorCount.getOrDefault(color,0)+1);
            if(colorCount.get(color)==1){
                distinctColors++;
            }
            ans[i] = distinctColors;
        }
        return ans;
    }
}