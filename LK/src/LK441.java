public class LK441 {
    public static void main(String[] args) {

    }
}


//经典的暴力解法
class Solution441 {
    public int arrangeCoins(int n) {
        int rows = 0;
        int add = 1;
        while (n > rows) {
            rows++;
            n -= add;
            add += 1;
        }
        return rows;
    }
}
//复制来的二分代码 （看不懂）
/*
对于 nn 个硬币而言，最多凑成的行数不会超过 nn 行，当且仅当 n = 1n=1 的时候可以取到。

假设最大能够凑成的行数为 xx，那么以 xx 为分割点的数轴上具有二段性，使用 nn 个硬币如果能够凑成 xx 行，那么必然也能够凑成少于等于 xx 行的阶梯硬币，必然不能凑成大于 xx 行的阶梯硬币。

对于 xx 行阶梯硬币所需要的硬币数量，还是可以利用等差数列求和公式直接算出。
 */
class Solution4411 {
    public int arrangeCoins(int n) {
        long l = 1, r = n;
        while (l < r) {
            long mid = l + r + 1 >> 1;
            if (mid * (mid + 1) / 2 <= n) l = mid;
            else r = mid - 1;
        }
        return (int) r;
    }
}

