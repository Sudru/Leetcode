public class MergeSortedList21 {
    public static void main(String[] args) {
        ListNode a = mergeTwoLists(getLinkedList(new int[]{}), getLinkedList(new int[]{0}));
        while(a != null){
            System.out.print(a.val + "->");
            a = a.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1,l2=list2,newHead,nl;
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val>l2.val){
             newHead = l2;
            l2 = l2.next;
        }         
        else{
            newHead = l1;
            l1= l1.next;
        }
        nl = newHead;
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                nl.next = l2;
                l2 = l2.next;
            }else{
                nl.next = l1;
                l1 = l1.next;
            }
            nl = nl.next;
                
        }
        while(l1 != null){
            nl.next = l1;
            l1 = l1.next;
            nl = nl.next;
        }
        while(l2 != null){
            nl.next = l2;
            l2 = l2.next;
            nl = nl.next;
        }
        return newHead;
        
    }
 public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 public static ListNode getLinkedList(int[] arr){
    if(arr.length == 0){
        return null;
    }
    ListNode head = new ListNode(arr[0]);
    ListNode temp = head;
    for(int i = 1;i<arr.length;i++){
        temp.next = new ListNode(arr[i]);
        temp = temp.next;
    }

    return head;
 }

}
