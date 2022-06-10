public class LK13 {
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution13 {
    public ListNode removeNthFromEnd(ListNode head, int n) {


        ListNode ans = new ListNode(0);
        ans.next=head;
        ListNode q = ans;
        ListNode s = ans;
        while(n!=0){
            q=q.next;
            n--;
        }

        while(q.next!=null){
            q=q.next;
            s=s.next;
        }

        s.next=s.next.next;
        return ans.next;

    }
    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //  ListNode dummy = new ListNode(-1);
    //  dummy.next = head;
    //  ListNode fast = dummy;
    //  ListNode slow = dummy;
    // //进行快指针先走n步
    // for(int i = 0;i<=n;i++){
    //     fast=fast.next;
    // }
    // while(fast!=null){
    //     fast=fast.next;
    //     slow=slow.next;
    // }
    // slow.next = slow.next.next;
    // return dummy.next;
    // }
    /*整体思路是让前面的指针先移动n步，之后前后指针共同移动直到前面的指针到尾部为止

    首先设立预先指针 pre，预先指针是一个小技巧，在第2题中进行了讲解
    设预先指针 pre 的下一个节点指向 head，设前指针为 start，后指针为 end，
    二者都等于 pre
    start 先向前移动n步
    之后 start 和 end 共同向前移动，此时二者的距离为 n，当 start 到尾部时，
    end 的位置恰好为倒数第 n 个节点
    因为要删除该节点，所以要移动到该节点的前一个才能删除，
    所以循环结束条件为 start.next != null
    删除后返回 pre.next，为什么不直接返回 head 呢，
    因为 head 有可能是被删掉的点
*/
}

