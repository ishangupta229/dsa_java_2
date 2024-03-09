public class Reverse_LL {

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

    public void addfirst(int data){
        node newnode = new node(data);
        size++;

        if (head==null) {
            head = tail = newnode;
            return;
        }
        
        newnode.next = head;
        head = newnode;

    }

    public void addlast(int data) {
        node newnode = new node(data);
        size++;
        if (head==null) {
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
    }

    public void addmid(int data, int x) {
        node newnode = new node(data);
        size++;
        if (head==null) {
            head=tail=newnode;
            return;
        }
        node temp = head;
        if (x==0) {
            newnode.next = head;
            head = newnode;
            return;
        }

        for (int i = 0; i < x-1; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void print() {
        node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void delete(int idx) {
        node temp = head;

        if (size==0) {
            head = temp = null;
            return;
        } else if(size==1){
            head = temp = null;
            size=0;
            return;
        }

        if (idx==0) {
            size--;
            head=head.next;
            return;
        }

        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
        }
        temp.next = (temp.next).next;
        size--;
        if (idx==size) {
            tail = temp;
        }
    }

    public int search(int data){
        node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == data) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void reverse() {
        node prev = null;
        node curr = tail=head;
        node next = head.next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addfirst(4);ll.addlast(6);ll.addfirst(2);ll.addfirst(1);ll.addmid(3, 2);ll.addmid(5, 4);
        ll.addfirst(0);
        ll.print();
        System.out.println(ll.search(5));
        ll.reverse();
        ll.print();
    }
}


