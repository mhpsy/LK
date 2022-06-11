public class LK744 {
}

class Solution744 {
    //基本的暴力解法
    public char nextGreatestLetter(char[] letters, char target) {
        for (char a : letters) {
            if (a > target) {
                return a;
            }
        }
        return letters[0];
    }
}

class Solution7441 {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length - 1;
        int mid;
        while (l < r) {
            mid = l + r >> 1;
            if (letters[mid] > target)
                r = mid;//因为有可能就是这个r所以不用-1
            else
                l = mid + 1;
        }
        //return letters[l]>target?letters[l]:letters[0];
        return letters[r] > target ? letters[r] : letters[0];
        // 因为循环退出条件是l=r 所以这里用r也是一样的
    }
}