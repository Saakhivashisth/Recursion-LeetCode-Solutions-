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
    public void swapPairsHelper(ListNode p,ListNode curr){
        //base case
        if(curr==null||curr.next==null){
            return;
        }
        //swap function
        ListNode f=curr;
        ListNode s=curr.next;

        f.next=s.next;
        s.next=f;
        p.next=s;

        swapPairsHelper(f,f.next);

    }
    public ListNode swapPairs(ListNode head) {
      ListNode dummy=new ListNode(-1);
      dummy.next=head;
      ListNode p=dummy;

      swapPairsHelper(p,head);
      return dummy.next;
    }
}