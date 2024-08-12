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
    public void reorderList(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }


        ListNode prev=null,start=slow.next;
        slow.next=null;
        ListNode start2=start;
        while(start2!=null){
            start2=start2.next;

            start.next=prev;
            prev=start;
            start=start2;

        }
        // while(head!=null){
        //     System.out.print(head.val+" ");
        //     head=head.next;
        // }


        int i=2;
        start=head;
        while(start!=null || prev!=null){
            if(i%2==0){
                ListNode temp=start;
                start=start.next;
                temp.next=prev;

            }
            else{
                ListNode temp=prev;
                prev=prev.next;
                temp.next=start;

            }
            i++;
        }


    }
}