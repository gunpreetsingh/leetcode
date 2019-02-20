import leetcode.LinkedList;
import leetcode.ListNode;

/**
 * Created by singhgu on 2/10/2019.
 */
public class reverseLinkedListRecurrsively206 {

    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null)
            return head;
        ListNode nextNode = head.next;
        head.next = null;
        ListNode rest = reverseList(nextNode);
        nextNode.next = head;
        return rest;
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addNode(new ListNode(0));
        list.addNode(new ListNode(1));
        list.addNode(new ListNode(2));
        list.addNode(new ListNode(3));
        list.addNode(new ListNode(4));
        list.addNode(new ListNode(5));

        ListNode node = reverseList(list.head);

        while(node != null){
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println();
    }
}
