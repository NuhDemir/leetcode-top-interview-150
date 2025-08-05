class Solution {
   public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s1 = m - 1;
        int s2 = n - 1;
        int sMerge = m + n - 1;
        
        while (s2 >= 0) {
            if (s1 >= 0 && nums1[s1] > nums2[s2]) {
                nums1[sMerge--] = nums1[s1--];
            } else {
                nums1[sMerge--] = nums2[s2--];
            }
        }
    }
}