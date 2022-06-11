public class LK1608 {
    public static void main(String[] args) {
        Solution1608 solution1608 = new Solution1608();
        int i = solution1608.specialArray(new int[]{3, 5});
        System.out.println(i);
    }
}


class Solution1608 {
    public int specialArray(int[] nums) {
        int ans = 0;
        //因为这里不进入数组 但是要判断到数字下标结束后的一位才可以
        //因为存在[3,5]这样的case,要返回2
        //如果写成i<nums.length那么不会跑完的
        for(int i =0;i<=nums.length;i++){
            if(judge(nums,i)){
                return i;
            }
        }
        return -1;
    }
    public boolean judge(int[] nums,int a){
        int count = 0;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]>=a){
                count++;
            }
        }
        return a==count;
    }
}
