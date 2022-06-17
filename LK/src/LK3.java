public class LK3 {
    public static void main(String[] args) {
        System.out.println(new Solution3().lengthOfLongestSubstring("abcabcbb"));//3
        System.out.println(new Solution3().lengthOfLongestSubstring("bbbbbb"));//3

    }

}
class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int start = 0;
        int index;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            index = s.charAt(i);
            start=Math.max(start,arr[index]);
            ans=Math.max(ans,i-start+1);
            arr[index]=i+1;
        }
        return ans;
    }
}

class Solution311111 {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int start = 0;
        int index = s.length();
        int swap,ans=0;
        for(int i = 0; i<index;i++){
            swap = s.charAt(i);

            start = Math.max(start,arr[swap]);
            //如果swap之前也出现过，那么移动start的位置，
            //也就是移动到没有一个没有重复元素的位置
            //按照道理还说应该移动到arr[swap]里面值的下一个元素
            //但是因为直接存入的就是i+1所以直接让start取大的就好了


            //这行代码就是简单的选取最大值
            //加1的原因是因为有两个元素下标分别为[0,1] 1-0+1才会等于2
            ans = Math.max(ans,i-start+1);

            arr[swap]=i+1;
            //代表上一次出现的位置，
            //但是字符串内字符不能重复，
            //所以要从上一次出现位置的下一个位置开始
        }
        return ans;
    }
}

//参考来自力扣里面的一个评论
//这是大佬的源代码 大佬的id南星
class Solution3111111111 {
    public int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }
}
//大佬解释的原文
/*
我尝试着解释了一下，希望对大家有所帮助~

以这个字符串为例：abcabcbb，当i等于3时，也就是指向了第二个a,
此时我就需要查之前有没有出现过a, 如果出现了是在哪一个位置出现的。
然后通过last[index] 查到等于1, 也就是说，如果start 依然等于0的话，
那么当前窗口就有两个a了，也就是字符串重复了，所以我们需要移动当前窗口的start指针，
移动到什么地方呢？移动到什么地方，窗口内就没有重复元素了呢？
对了，就是a上一次出现的位置的下一个位置，就是1 + 1 = 2。当start == 2,
当前窗口就没有了重复元素，那么以当前字符为结尾的最长无重复子串就是bca,
然后再和之前的res取最大值。然后i指向后面的位置，按照同样思路计算。
 */
