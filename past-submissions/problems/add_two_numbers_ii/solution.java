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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        ListNode p1 = reverse(l1);
        ListNode p2 = reverse(l2);
        while(p1!=null || p2!=null || carry!=0){
            int sum = carry;
            if(p1!=null){
                sum+= p1.val;
                p1 = p1.next;
            }
            if(p2!=null){
                sum+= p2.val;
                p2 = p2.next;
            }
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
        }
        return reverse(dummy.next);
    }
    private ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        return prev;
    }
}