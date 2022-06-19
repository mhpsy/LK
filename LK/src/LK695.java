import java.util.ArrayList;

public class LK695 {
}

//经典的dfs递归

/**
 * 力扣上面给这种题目叫做：广度优先搜索 / 深度优先搜索
 * 这个名字有点形象 总是也是递归的原理 递归就是设置一个退出条件写好就行了 进入条件一般都很简单
 * （进入条件一般也就是退出条件相反的情况）
 * 一般我喜欢给这种题目的条件分开判断 但是要注意判断数组是否越界是要优先于判断是否满足条件的
 *
 *
 */
class Solution695 {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int dfsArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    dfsArea = dfs(grid, i, j);
                    maxArea = Math.max(maxArea, dfsArea);
                }
            }
        }

        return maxArea;
    }

    public int dfs(int[][] grid, int x, int y) {
        int countArea = 0;
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length) {
            return 0;
        }
        if (grid[x][y] == 0) {
            return 0;
        }
        //不重复扫描扫过的所以设置为0
        grid[x][y] = 0;
        countArea++;
        countArea += dfs(grid, x + 1, y);
        countArea += dfs(grid, x - 1, y);
        countArea += dfs(grid, x, y + 1);
        countArea += dfs(grid, x, y - 1);

        return countArea;
    }

}
