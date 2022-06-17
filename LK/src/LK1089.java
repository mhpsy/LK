import java.util.Arrays;

public class LK1089 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] arr1 = {0, 0, 0, 0, 0, 0, 0};
        new Solution10891().duplicateZeros(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    /**
     * 比赛的第一题往往要求是5分钟内可以解决，首要考虑的是编码速度而不是时空复杂度
     * 其中一个常用的做法是利用字符串的操作函数，当中又以Split, Join, Replace最为简单粗暴
     * 思路来源力扣id呱呱编程实验室（上面的一段话也是他打的）
     * @param arr
     */
    public void duplicateZeros(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; ++i)
            sb.append(arr[i]);
        String s = sb.toString();
        s=s.replace("0","00");
        for (int i = 0; i < arr.length; ++i)
            arr[i] = s.charAt(i) - '0';
    }

}

class Solution10891 {
    public void duplicateZeros(int[] arr) {
        int index = arr.length;
        int i = 0;
        int j = 0;

        //此处这个循环判断条件写成j<index会好很多
        //如果是判断i那么后续很容易越界
        while (j < index) {
            if (arr[i] == 0) j++;
            i++;
            j++;
        }
        //此时j的值等于数组元素的个数 所以要--
        i--;
        j--;
        while (i >= 0) {
            //这个循环里面j最大也就是数组元素的个数
            if (j < index) {
                arr[j] = arr[i];
            }
            //--j>=0并不是为了防止j=-1还在赋值
            //而是为了零很多的情况
            //eg：[0,0,0,0,0,0,0]
            //此时有七个零 但是经过一个while循环i=4，j=8
            //--之后i=3,j=7这种每一个数字都需要复写的情况
            //如果j=7会越界 所以需要--而且第一个if里面不会进行赋值的因为j=index
            if (arr[i] == 0 && --j >= 0) {
                arr[j] = 0;
            }
            i--;
            j--;
        }
    }
}


class Solution1089 {
    public void duplicateZeros(int[] arr) {
        int n = arr.length, i = 0, j = 0;
        while (j < n) {
            if (arr[i] == 0) j++;
            i++;
            j++;
        }
        i--;
        j--;
        while (i >= 0) {
            if (j < n) arr[j] = arr[i];
            if (arr[i] == 0 && --j >= 0) arr[j] = 0;
            i--;
            j--;
        }
    }
}


// class Solution {
//     public void duplicateZeros(int[] arr) {
//         //靠 看题有点不认真 我一直以为需要扩容数组
//         int index = arr.length;
//         int i = 0,j=0;
//         while(i<index){
//             if(arr[i]==0)j++;
//             i++;j++;
//         }
//         if(i==j)return;
//         //此时i=8 j=11但是数组的下标只到7了，所以需要都--
//         //i--;
//         i--;j--;
//         // System.out.print(i+"\t"+j);
//         // while(i>=0&&j>=0){
//         //     if(j<index){
//         //         arr[j]=arr[i];
//         //         if(arr[i]==0){
//         //             arr[--j]=0;
//         //         }
//         //     }
//         //     i--;j--;
//         // }
//           while (i >= 0&&j>=0) {
//             if (j < index){
//                 arr[j] = arr[i+1];
//                 if (arr[i] == 0 && --j >= 0) arr[j] = 0;
//             }
//             i--; j--;
//         }


//     }
// }


