import org.w3c.dom.Node;

public class reverseLinkedList {
    public void reverseIterative(){
        if(head == null || head.next == null){
            return;
        }
         
        Node prevNode = head;
        Node currentNode = head.next;

        while(currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            //update
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next= head;
        head.next = null;

        return newHead;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        for(int i = 0; current != null && i < left -1; i++){
           prev = current;
           current = current.next; 
        }
        ListNode last = prev;
        ListNode newEnd = current;

        //reverse between left and right
        ListNode next = current.next;
        for(int i = 0; current != null && i< right - left +1; i++){
            current.next = prev;
            //update
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        if(last != null){
            last.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = current;
        return head;
    }
}
