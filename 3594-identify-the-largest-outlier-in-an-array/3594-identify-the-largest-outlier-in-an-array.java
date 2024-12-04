class Solution {
    public int getLargestOutlier(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int num[] = new int[nums.length];
        int j = num.length;
        Arrays.sort(nums);
        for(int i: nums) {
            sum += i;
            num[--j] = i;
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int res = Integer.MIN_VALUE;
        for(int i: num) {
            int ol = sum - i;
            if(ol % 2 != 0) {
                continue;
            }
            ol /= 2;
            map.put(i, map.get(i) - 1);
            if(map.getOrDefault(ol, -1) > 0) {
                res = Math.max(i, res);
                break;
            }
            map.put(i, map.get(i) + 1);
        }
        return res;
    }
}