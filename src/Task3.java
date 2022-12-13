public class Task3 {
    //https://leetcode.com/problems/merge-sorted-array/submissions/858178461/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int copy = n + m - 1;
        n -= 1; //чтобы не делать n-1
        m -= 1; //чтобы не делать m-1
        while (n >= 0) {
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[copy] = nums1[m--]; //чтобы не делать на следю строке m--
            } else {
                nums1[copy] = nums2[n--];
            }
            copy -= 1;
        }


    }
}
