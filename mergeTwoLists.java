public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        while(curr2!= null && curr1!=null){
            if(curr2.val>curr1.val){
                head.next = new ListNode(curr1.val);
                curr1 = curr1.next;
                System.out.println("check01");
            }
            else{
                head.next = new ListNode(curr2.val);
                curr2 = curr2.next;
                System.out.println("check02");
            }
            head = head.next;

        }
        while(curr2!=null){
            head.next = new ListNode(curr2.val);
            curr2 = curr2.next;
            head = head.next;
            System.out.println("check2");
        }
        while(curr1!=null){
            head.next = new ListNode(curr1.val);
            curr1 = curr1.next;
            head = head.next;
            System.out.println("check1");
        }
        return result.next;
    }
}