import leetcode.LinkedList;
import leetcode.ListNode;

/**
 * Created by singhgu on 2/10/2019.
 */
public class reverseLinkedListIteratively206 {
    public static ListNode reverseList(ListNode head){
        ListNode previous = null;
        ListNode current = head;

        while(current != null){
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
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
