class Solution {
    public int getLargestOutlier(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            sum += i;
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int res = Integer.MIN_VALUE;
        for(int i: nums) {
            int ol = sum - i;
            if(ol % 2 != 0) {
                continue;
            }
            ol /= 2;
            System.out.println(ol);
            map.put(i, map.get(i) - 1);
            if(map.getOrDefault(ol, -1) > 0) {
                res = Math.max(i, res);
            }
            map.put(i, map.get(i) + 1);
        }
        return res;
    }
}