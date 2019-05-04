class LinkedList{
    ListNode head;
    public void insert(int data){
        ListNode current = head;
        if(head == null){
            head = new ListNode(data);
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(data);

    }
    public void prepend(int data){
        ListNode current = head;
        if(head == null){
            head = new ListNode(data);
        }
        else{

        }
    }
    public void printList(){
        ListNode current = head;
        int i=0;
        while(current != null){
            System.out.print("\nlist item "+i+": "+ current.data);
            i++;
            current = current.next;
        }
    }
}