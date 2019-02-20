import leetcode.ListNode;

/**
 * Created by singhgu on 2/10/2019.
 */
public class LinkedListCycle141 {

    public boolean hasCycle(ListNode head){
        if(head == null)
            return false;
        ListNode first = head.next;
        ListNode second = head;

        while(first != null && first.next != null && second != null){
            if(first == second)
                return true;
            first = first.next.next;
            second = second.next;
        }
        return false;
    }
}
