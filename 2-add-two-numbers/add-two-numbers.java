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
class Solution {
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        int sum = 0;
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode t = dummy;
        while(a!=null || b!=null || carry != 0){
            int x = a!=null?a.val:0;
            int y = b!=null?b.val:0;
            int total = x+y+carry;
            t.next = new ListNode(total%10);
            carry = total/10;
            if(a!=null)
                a = a.next;
            if(b!=null)
                b = b.next;
            t = t.next;
        }
        if(carry>0){
            t.next=new ListNode(carry);
        }
        return dummy.next;
    }
}