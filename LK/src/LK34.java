import java.util.Arrays;

public class LK34 {
    public static void main(String[] args) {
//        int[] testCase = {5, 7, 7, 8, 8, 10};
        int[] testCase2 = {2, 2};
//        int[] ints = new Solution34().searchRange(testCase, 8);
        int[] ints = new Solution34().searchRange(testCase2, 3);
        System.out.println(Arrays.toString(ints));


    }
}

class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int l = -1;
        int r = nums.length;
        int mid;
        int[] ans = new int[2];
        while (l + 1 != r) {
            mid = (l + r) / 2;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid;
            }
        }
        ans[0] = r;
        l = -1;
        r = nums.length;
        while (l + 1 != r) {
            mid = (l + r) / 2;
            if (nums[mid] <= target) {
                l = mid;
            } else {
                r = mid;
            }
        }
        ans[1] = l;
        if (ans[0] < nums.length && ans[1] < nums.length)
            if (nums[ans[0]] == target && nums[ans[1]] == target) {
                return ans;
            }
        return new int[]{-1, -1};
    }
}
