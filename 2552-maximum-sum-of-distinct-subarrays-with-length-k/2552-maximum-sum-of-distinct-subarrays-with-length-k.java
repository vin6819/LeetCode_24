class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long sum = 0, max = 0;
        int start = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(i - start + 1 == k) {
                if(map.size() == k) {
                    max = Math.max(sum, max);
                }
                sum -= nums[start];
                if(map.get(nums[start]) == 1) {
                    map.remove(nums[start]);
                }
                else {
                    map.put(nums[start], map.get(nums[start]) - 1);
                }
                start++;
            }
        }
        return max;
    }
}