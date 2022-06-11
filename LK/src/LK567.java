public class LK567 {
    public static void main(String[] args) {
        Solution567 solution567 = new Solution567();
        String s1 = "abc";
        String s2 = "ccccbbbbaaaa";
        System.out.println(solution567.checkInclusion(s1, s2));
    }

}

class Solution567 {
    /*
    思路如下：
    将每个字符串相同的字母的值加起来进行比较，
    然后在对比s2的子字符串是否包含相同的字符，如果两个条件都满足就true
     */
    public boolean checkInclusion(String s1, String s2) {
        int sum = 0;
        for (char a : s1.toCharArray()) {
            sum += (int) a;
        }

        int ansTest,index = 0,diff=0;
        for (int i = 0; i < s2.length(); i++) {
            ansTest = 0;
            for (int j = i; j < i + s1.length() && j < s2.length(); j++) {
                ansTest += s2.charAt(j);
                index=j;
            }
            if (ansTest == sum) {
                String substring = s2.substring(index - s1.length()+1, index+1);
                for (int j = 0; j < s1.length(); j++) {
                    diff = substring.indexOf(s1.charAt(j));
                    if(diff<0) break;
                }
                if(diff>=0){
                    return true;
                }
            }

        }

        return false;

    }
}
