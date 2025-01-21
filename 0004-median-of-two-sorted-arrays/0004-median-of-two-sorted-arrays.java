class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length, new_arr[] = new int[m + n], i = 0, j = 0, ind = 0;
        for(; i < m && j < n; ) {
            if(nums1[i] < nums2[j]) {
                new_arr[ind++] = nums1[i];
                i++;
            }
            else {
                new_arr[ind++] = nums2[j];
                j++;
            }
        }
        for(; i < m; i++) {
            new_arr[ind++] = nums1[i];
        }
        for(; j < n; j++) {
            new_arr[ind++] = nums2[j];
        }
        double median = (ind % 2 == 1) ? new_arr[ind / 2] : (double)(new_arr[ind / 2 - 1] + new_arr[ind / 2]) / 2;
        return median;
    }
}