class Solution {
    public int mySqrt(int x) {
        if(x==1)return 1;
        if(x==0)return 0;
        int l = 0;
        int r = x/2;
        int mid;
        while (l<r){
            mid = l+(r-l+1)/2;
            if(mid>x/mid){
                r=mid-1;
            }else{
                l=mid;
            }
        }
        return l;
    }
}
/*
如果这个整数的平方 恰好等于 输入整数，那么我们就找到了这个整数；
如果这个整数的平方 严格大于 输入整数，那么这个整数肯定不是我们要找的那个数；
如果这个整数的平方 严格小于 输入整数，那么这个整数 可能 是我们要找的那个数（重点理解这句话）。

在区间只有 2 个数的时候，本题 if、else 的逻辑区间的划分方式是：[left..mid - 1] 与 [mid..right]。
如果 mid 下取整，在区间只有 2 个数的时候有 mid 的值等于 left，一旦进入分支
[mid..right] 区间不会再缩小，出现死循环。

当搜索区间 [left..right] 里只有 2 个元素的时候：

如果划分区间的逻辑是 left = mid + 1; 和 right = mid; 时
，while(left < right) 退出循环以后 left == right 成立，此时 mid 中间数正常下取整就好；
如果划分区间的逻辑是 left = mid; 和 right = mid - 1; 时
，while(left < right) 退出循环以后 left == right 成立，此时为了避免死循环，mid 中间数需要改成上取整。



*/


