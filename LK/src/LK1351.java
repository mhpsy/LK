public class LK1351 {
    public static void main(String[] args) {
        int arr[][] = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.print(new Solution1351().countNegatives(arr));
    }

}

class Solution1351 {
    public int countNegatives(int[][] grid) {
        int out = grid.length;
        int in = grid[0].length;
        int ans = 0;
        for (int i = out - 1; i >= 0; i--) {
            for (int j = in - 1; j >= 0; j--) {
                if (grid[i][j] < 0) {
                    ans++;
                } else {
                    break;
                }
            }
        }


        return ans;
    }

}
/*
题目：
给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。 请你统计并返回 grid 中 负数 的数目。
 */
/*
思路：
从矩阵的右下角开始找
 */
