public class LK167 {

}
class Solution167 {
    public int[] twoSum(int[] numbers, int target) {

        //因为题目给的是一个非递减顺序排列
        //所以可以使用二分查找，下面写了一个很简单的二分
        for(int i =0,j=numbers.length-1;i<j;){
            int sum = numbers[i]+numbers[j];
            if(sum == target){
                return new int[]{i+1,j+1};
                //因为要返回索引的位置所以都要+1
            }else if(sum>target){
                j--;
            }else if(sum<target){
                i++;
            }
        }
        return new int[2];
    }
}
/*
    最开始写的暴力解法
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int [2];
        for(int i = 0;i<numbers.length;i++){
            for(int j = 0;j<numbers.length;j++){
                if(i==j){
                    continue;
                }
                if((numbers[i]+numbers[j])==target){
                    ans[1]=(i>j?i:j)+1;
                    ans[0]=(i>j?j:i)+1;
                }
            }
        }
        return ans;
    }
*/
