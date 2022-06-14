import java.util.Arrays;

public class LK1337 {
}
class Solution1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int out = mat.length;
        int in = mat[0].length;
        int[][] ans = new int[out][2];
        int l =0;
        int r = in;
        int mid = 0;
        for(int i = 0;i<out ;i++){
            ans[i][1]=i;//0保存1的个数 1的索引保存索引
            l=0;r=in;
            while(l<r){
                mid=(l+r)/2;
                if(mat[i][mid]==1){
                    l = mid +1;
                }else{
                    r =mid;
                }
            }
            ans[i][0]=l;
        }
        Arrays.sort(ans,(a, b)->a[0]-b[0]);
        int ren[]= new int[k];
        for(int i =0;i<k;i++){
            ren[i]=ans[i][1];
        }

        return ren;
    }
}
