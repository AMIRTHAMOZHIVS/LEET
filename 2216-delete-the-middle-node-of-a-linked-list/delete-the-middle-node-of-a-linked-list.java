class Solution {
    public ListNode deleteMiddle(ListNode head) {

        if(head == null || head.next == null)
            return null;

        int count = 0;
        ListNode temp = head;

        // find length
        while(temp != null){
            count++;
            temp = temp.next;
        }

        int middle = count / 2;

        // go to node before middle
        temp = head;

        for(int i = 0; i < middle - 1; i++){
            temp = temp.next;
        }

        // delete middle
        temp.next = temp.next.next;

        return head;
    }
}