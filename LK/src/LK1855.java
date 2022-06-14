public class LK1855 {
}
//有时间再去看一下力扣的原题 重新写一下
class Solution1855 {
    public int maxDistance(int[] nums1, int[] nums2) {
        int l = 0;
        int r = 0;
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        while (l < nums1Len && r < nums2Len) {
            if (nums1[l] > nums2[r]) {
                l++;
            }
            r++;
        }
        //直接找到最近的的l和最远的r
        return r - l - 1 >= 0 ? r - l - 1 : 0;

    }
}
