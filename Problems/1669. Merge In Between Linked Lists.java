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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode s1=list1;
        ListNode s2=list1,e2=list2;;
        while(s1!=null && a>1){
            s1=s1.next;
            a--;
        }

        while(s2!=null && b>0){
            s2=s2.next;
            b--;
        }
        s1.next=list2;
        while(e2.next!=null){
            e2=e2.next;
        }
        e2.next=s2.next;
        return list1;
    }
}