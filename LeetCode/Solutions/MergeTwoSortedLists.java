// This is not merge // This is LinkedList

class MergeTwoSortedLists extends LinkedList{
    public static Node Merge(Node l1, Node l2){
        Node merged;
        if(l1 == null && l2 == null){
            return null;
        }
        else if(l1 == null || l2 == null){
            System.out.print(l1 == null? l2.data : l1.data);
            return l1 == null ? l2 : l1;
        }
        else{
            if(l1.data <= l2.data){
                merged = l1;
                System.out.print("l1:"+l1.data);
            }
            else{
                merged = l2;
                System.out.print("l2"+l2.data);
            }
        }
        merged = Merge(l1.next, l2.next);
        return merged;
    }
    public static void main(String a[]){
        System.out.print("");
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(3);
        ll.insert(5);
        ll.printList();
        LinkedList l2 = new LinkedList();
        l2.insert(1);
        l2.insert(2);
        l2.insert(4);
        l2.printList();
        Node merged;
        merged = Merge(ll.head ,l2.head);
        //LinkedList m = new LinkedList();
        //merged.printList();

    }
}
