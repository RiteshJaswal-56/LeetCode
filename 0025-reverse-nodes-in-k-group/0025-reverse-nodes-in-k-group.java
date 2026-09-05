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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode grpprev = dummy;

        while(true){
            ListNode kth = kthNode(grpprev , k);
            if(kth==null){
                break;
            }
            ListNode grpnext = kth.next;
            kth.next = null;

            ListNode grphead = grpprev.next;
            ListNode newhead = reverseLinkedList(grphead);

            grpprev.next = newhead;
            grphead.next = grpnext;
            grpprev = grphead; 
        }
        return dummy.next;
    }
    public ListNode reverseLinkedList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public ListNode kthNode(ListNode head, int k){
        ListNode curr = head;
        while(curr!=null && k>0){
            curr = curr.next;
            k--;
        }
        return curr;
    }
}