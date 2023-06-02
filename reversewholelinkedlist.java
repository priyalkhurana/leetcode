class Solution {
    public ListNode reverseList(ListNode head) {

        if(head== null){
            return head;
        }
        ListNode present= head;
        ListNode prev= null;
        ListNode next= present.next;

        while(present!=null){
            present.next= prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
    return prev;
    }
}
