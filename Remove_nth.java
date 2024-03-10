public class Remove_nth {
    public static class node{
        int data;
        node next;

        public node(int data) {
            this.data=data;
            this.next=null;
        }       
    }

    public static node head;
    public static node tail;
    public static int size;
    
    public void addfirst(int data) {
        node newnode = new node(data);
        size++;
        newnode.next = head;
        head = newnode;
    }

    public void addlast(int data) {
        node newnode = new node(data);
        size++;
        node temp = head;
        for (int i = 0; i < size-2; i++) {
            temp = temp.next;
        }
        temp.next = newnode;
        tail = newnode;
    }
    public void print() {
        node temp = head;
        while (temp!=null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void Rem_nth(int idx) {
        int n = size-idx-1; // 5-3-1=2-1=1
        if (idx==size) {
            head = head.next;
            return;            
        }
        node temp = head;
        for (int i = 0; i < n; i++) {
            temp=temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public static void main(String[] args) {
        Remove_nth ll = new Remove_nth();
        ll.addfirst(2);ll.addlast(3);ll.addfirst(1);ll.addlast(4);ll.addfirst(0);
        System.out.println(size);
        ll.print();
        ll.Rem_nth(size);
        ll.print();
    }
}
