/* Problem Statement
Given a singly linked list, delete middle node of the linked list. For example, if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5.

If there are even nodes, then there would be two middle nodes, we need to delete the second middle element. For example, if given linked list is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6.

In case of a single node return the head of a linked list containing only 1 node which has value -1 */


/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node deleteMiddleElement(Node head) {
		// return the head of the modified Linked List
        if(head.next==null){
            head.val=-1;
        }
        else{
            Node slow=head;
            Node fast=head;
            while(fast.next.next!=null &&fast.next.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            Node delete=slow.next;
            slow.next=slow.next.next;
            delete.next=null;
        }
        return head;
    }