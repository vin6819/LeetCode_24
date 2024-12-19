class Solution {
    public int maxChunksToSorted(int[] arr) {
        int sum = 0, curr = 0, res = 0;
        for(int i = 0; i < arr.length; i++) {
            curr += i;
            sum += arr[i];
            if(curr == sum) {
                res++;
            }
        }
        return res;
    }
}