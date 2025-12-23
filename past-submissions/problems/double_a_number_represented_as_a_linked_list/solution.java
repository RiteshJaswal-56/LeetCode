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
    public ListNode doubleIt(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        head = reverse(head);

        ListNode curr = head;
        int carry = 0;
        while(curr!=null || carry!=0){
            int product = carry;
            if(curr!=null){
                product += curr.val * 2;
                curr = curr.next;
            }
            carry = product/ 10;
            temp.next = new ListNode(product % 10);
            temp = temp.next; 
        }
        return reverse(dummy.next);
    }
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr= nextNode;
        }
        return prev;

    }
}