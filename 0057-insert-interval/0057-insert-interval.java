class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        list.add(newInterval);
        Collections.sort(list, (a, b) -> a[0] - b[0]);
        // for(int i[]: list) {
        //     System.out.println(Arrays.toString(i));
        // }
        List<int[]> res = new ArrayList<>();
        res.add(list.get(0));
        for(int i = 1; i < list.size(); i++) {
            int a[] = res.get(res.size() - 1);
            int b[] = list.get(i);
            if(a[1] >= b[0]) {
                a[1] = Math.max(b[1], a[1]);
                res.remove(res.size() - 1);
                res.add(a);
            }
            else {
                res.add(b);
            }
        }
        int ans[][] = res.toArray(new int[0][0]);
        return ans;
    }
}