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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head,prev=null,temp=head,go=head;
        if(fast.next==null) return true;
        if(fast.next.next==null){
            if(fast.next.val==fast.val) return true;
            return false;
        }
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp1;
        temp1=slow.next;

        slow.next=null;

        while(temp!=null){
            go=go.next;
            temp.next=prev;
            prev=temp;
            temp=go;
        }

        if(fast.next==null)
            slow=slow.next;
        while(temp1!=null){
            if(slow.val!=temp1.val) return false;
            slow=slow.next;
            temp1=temp1.next;
        }

        return true;
    }
}
