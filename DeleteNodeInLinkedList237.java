public class DeleteNodeInLinkedList237 {
    public void deleteNode(ListNode node) {
        ListNode temp = node;
           while(temp.next.next!=null){
               temp.val = temp.next.val;
               temp = temp.next;
           }
           temp.val = temp.next.val;
           temp.next = null;
       }
       public class ListNode{
        int val;
        ListNode next;
       }
}
