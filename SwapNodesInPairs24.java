/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode currentNode = head;
        ListNode adjacentNode = head;
        ListNode afterNode = null;
        ListNode prevNode = null;
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead = head.next;
        while(currentNode!=null && currentNode.next!=null){
           adjacentNode = currentNode.next;
           afterNode = adjacentNode.next;

            adjacentNode.next = currentNode;
            currentNode.next = afterNode;       
            if(prevNode == null){
                prevNode = currentNode;
            }else{
                prevNode.next = adjacentNode;
            }
            prevNode = currentNode;
            currentNode = afterNode; 

        }
        return newHead;
    }
}
