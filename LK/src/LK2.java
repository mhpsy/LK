public class LK2 {

}
class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //最终返回head
        ListNode head = new ListNode(-1);
        ListNode p = head;
        //p的作用是用来构建新的节点
        int value = 0;
        //while(l1.next!=null||l2.next!=null||carry!=0){
        //不可以写成注释里面的这样子
        //可以直接判断l1本身是否为空 不用判断下一个
        //因为if还会在判断一次l1本身是否为空才会相加上
        while(l1!=null||l2!=null||value!=0){
            if(l1!=null){
                value+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                value+=l2.val;
                l2=l2.next;
            }
            ListNode pp = new ListNode(value%10);
            p.next=pp;
            p=p.next;
            //可以直接用一个变量存储进位以及相加的和
            value /= 10;
        }
        return head.next;
        //因为直接在head.next下面去拼接的


    }
}
