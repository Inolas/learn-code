class ListNode{
    int data;
    ListNode next;
    public Node(int data){
        this.data = data;
    }
    public void printList(){
        ListNode current = this;
        int i=0;
        while(current.next != null){
            System.out.print("\nlist item "+i+": "+ current.data);
            i++;
            current = current.next;
        }
    }
}

