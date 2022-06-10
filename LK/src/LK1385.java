public class LK1385 {
}
class Solution1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        for(int a1 : arr1){
            boolean flag = true;
            for(int a2 :arr2){
                if(Math.abs(a1-a2)<=d){
                    flag = false;
                }
            }
            if(flag){
                ans++;
            }
        }
        return ans;
    }
}
//上面为一分钟写的暴力解法，可能以后会写一个二分（我也不清楚）




