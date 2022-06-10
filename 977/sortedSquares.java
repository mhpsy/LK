class Solution {
    public int[] sortedSquares(int[] nums) {

        int l = 0;
        int r = nums.length-1;
        int index = r;
        int[] ans = new int[nums.length];
        while(l<r){
            if( nums[l]*nums[l]>nums[r]*nums[r] ){
                ans[index--]=nums[l]*nums[l];
                l++;
            }else {
                ans[index--]=nums[r]*nums[r];
                r--;
            }
        }
        return ans;

    }
}
