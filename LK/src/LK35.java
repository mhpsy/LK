public class LK35 {

    public static int searchInsert2(int[] nums, int target) {
        int l = 0;
        int r= nums.length -1;
        int mid = 0;
        while(l<=r){
            mid = l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                r = mid -1;
            }else{
                l = mid +1;
            }
        }
        return l;
        //判断条件为l<=r也就是退出循环的条件为l>r也就是正确的下标位置
    }
}

