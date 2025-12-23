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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddDummy = new ListNode(0);
        ListNode evenDummy = new ListNode(0);

        ListNode odd = oddDummy;
        ListNode even = evenDummy;

        int index = 1;
        ListNode curr = head;
        while(curr != null){
            if(index % 2 == 1){
                odd.next = curr;
                odd = odd.next;
            }
            else{
                even.next = curr;
                even = even.next;
            }
            curr = curr.next;
            index++;
        }
        even.next = null;
        odd.next = evenDummy.next;
        return oddDummy.next;
    }
}