public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode fast = new ListNode();
        ListNode slow = new ListNode();
        //ListNode node = head;
        fast =head;
        slow =head;
        while(fast!= null && fast.next!=null ){
            fast=fast.next.next;
            slow=slow.next;
            if(fast== slow){
                return true;
            }
        }
        return false;
     }
}
