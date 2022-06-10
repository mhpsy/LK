public class LK557 {
    public static void main(String[] args) {

    }
}
class Solution557 {
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        for (String s1 : s.split(" ")) {
            char[] chars = s1.toCharArray();
            for(int i = chars.length-1;i>=0;i--){
                sb.append(chars[i]);
            }
            sb.append(" ");
        }
        return sb.substring(0,sb.length()-1).toString();
    }
}