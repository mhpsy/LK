class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int r = Arrays.stream(piles).max().getAsInt();
        int left = 1;
        int speed = 0;
        int mid;
        while (left < r) {
            mid = left + (r - left) / 2;
            if (judgeSpeed(piles, mid) > h) {
                left = mid + 1;
            } else {
                r = mid;
            }
        }
        return left;
    }

    public int judgeSpeed(int[] piles, int h) {
        int sum = 0;
        for (int i : piles) {
            sum += (i % h == 0 ? i / h : i / h + 1);
        }
        return sum;
    }
}

// 重点概括：

// 由于速度是一个整数，可以使用「二分查找」，经典的《幸运 52》猜价格游戏就是这样；
// 确定搜索的速度范围：最小是 1，最大是香蕉堆里最大的那一堆的香蕉个数；
// 速度越大，耗时越少，速度越少，耗时越大。
// 「二分查找」先猜一个速度（位于搜索范围中间），然后用这个速度去尝试耗时（需要遍历一次香蕉堆）：如果耗时严格大于
// h，说明速度小了，应该猜一个更大的速度，所以搜索范围是 [mid + 1..right]，设置 left = mid + 1 。反之，耗时小于等于
// h，说明当前猜的这个速度 mid 可能是符合题意的一个解（不能排除掉，后面的搜索表示找有没有更小的速度），所以搜索范围是 [left..mid]，设置
// right = mid。
// 再三强调：

// while (left < right) 只表示字面意思：循环可以继续的条件是 left < right；
// while (left < right) 退出循环的时候 left 与 right 重合，表示我们找到的最优解，这是这种写法我们最想要的地方；
// 搜索区间「左闭右开」的意思是：如果我知道搜索范围是 [1..10] ，设置 right = 11，这叫「左闭右开」，不是看到 while (left <
// right) 就说搜索区间是「左闭右开」；
// 写对「二分查找」是因为我们真的懂得如何设计条件缩小搜索区间，利用「有序性」或者「单调性」。不是因为把区间表示成「左闭右开」，不是用了神奇的万能模版。