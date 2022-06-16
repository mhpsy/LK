public class LK209 {
}
class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        //最初此处使用的是mix=nums.length
        //但是不可以的 因为有最小长度正好就是数组长度
        int mix = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0,j = 0;i<nums.length;i++){
            sum+=nums[i];
            //if sum>=target 那么就说明左边可能有冗余存在
            //这里不可以用if,因为if只能去掉一个冗余 实际可能存在多个冗余
            while(sum>=target){
                mix = Math.min(mix,i-j+1);
                sum-=nums[j++];
            }
        }
        //if mix==Integer.MAX_VALUE 那么说明一次都没执行到while(sum>=target){
        //也就是说全部元素加起来都不够target
        return mix==Integer.MAX_VALUE?0:mix;
    }
}
