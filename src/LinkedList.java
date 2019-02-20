import leetcode.ListNode;

/**
 * Created by singhgu on 2/10/2019.
 */
public class LinkedList {
    ListNode head;

    public void addNode(ListNode node){
        if(head == null)
            head = node;
        else{
            ListNode temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    public void printLinkedList(){
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}
