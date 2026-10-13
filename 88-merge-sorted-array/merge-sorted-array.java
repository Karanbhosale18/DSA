class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] clone = new int[m];

        for (int i = 0; i < m; i++) {
            clone[i] = nums1[i];
        }

        int p1 = 0, p2 = 0, r = 0;

        while (p1 < m && p2 < n) {
            if (clone[p1] <= nums2[p2]) {
                nums1[r++] = clone[p1++];
            } else {
                nums1[r++] = nums2[p2++];
            }
        }

        while (p1 < m) {
            nums1[r++] = clone[p1++];
        }

        while (p2 < n) {
            nums1[r++] = nums2[p2++];
        }

    }
}