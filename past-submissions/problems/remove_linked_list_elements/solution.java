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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode current = head;
        if(head == null){
            return null;
        }
        while(current != null){
            if (current.val == val){
                ListNode temp = current.next;
                if(prev == null){
                    current = temp;
                    head = temp;
                }
                else{
                    prev.next = temp ;
                    current = temp;
                }
                
            }
            else{
                prev = current;
                current = current.next;
            }
        }
        return head;
    }
}