/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return head;
        }
        HashMap<Node , Node> map= new HashMap<>();

        Node curr = head;
        Node dummy = new Node(0);
        Node temp = dummy;

        while(curr!=null){
            Node copy = new Node(curr.val);
            map.put(curr , copy);

            temp.next = copy;
            temp = temp.next;
            curr = curr.next;
        }
        curr = head;
        Node copycurr = dummy.next;
        while(curr!=null){
            copycurr.random = map.get(curr.random);

            curr = curr.next;
            copycurr = copycurr.next;
        }
        return dummy.next;
    }
}