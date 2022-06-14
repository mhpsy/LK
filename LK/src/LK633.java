public class LK633 {
}
/*
给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。
 */
class Solution633 {
    public boolean judgeSquareSum(int c) {
        int max = (int)Math.sqrt(c);
        for(int a = 0 ;a<=max ;a++){
            int b = (int)Math.sqrt(c-a*a);
            if(a*a+b*b==c){
                return true;
            }
        }
        return false;
    }
}
