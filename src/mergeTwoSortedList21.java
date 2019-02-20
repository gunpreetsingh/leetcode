import leetcode.LinkedList;
import leetcode.ListNode;

/**
 * Created by singhgu on 2/9/2019.
 */
public class mergeTwoSortedList21 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode newNode = head;

        if(l1 == null && l2 == null)
            return null;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        while(l1 != null || l2 != null){
            if(l1 == null){
                newNode.val = l2.val;
                newNode.next = l2.next;
                break;
            }
            if(l2 == null){
                newNode.val = l1.val;
                newNode.next = l1.next;
                break;
            }
            if(l1.val < l2.val){
                newNode.val = l1.val;
                l1 = l1.next;
            }
            else {
                newNode.val = l2.val;
                l2 = l2.next;
            }
            newNode.next = new ListNode(0);
            newNode = newNode.next;
        }
        return head;
    }

    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.addNode(new ListNode(1));
        list1.addNode(new ListNode(2));
        list1.addNode(new ListNode(4));

        list2.addNode(new ListNode(1));
        list2.addNode(new ListNode(3));
        list2.addNode(new ListNode(4));

        ListNode node = mergeTwoLists(list1.head, list2.head);

        while(node != null){
            System.out.print(node.val+"->");
            node = node.next;
        }
    }

}


