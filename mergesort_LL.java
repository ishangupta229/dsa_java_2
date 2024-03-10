public class mergesort_LL {

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
    public static int count;

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
    // public static node mid;
    private node mid(node head){
        node slow = head;
        node fast = head.next;
        while (fast!= null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;         
        }
        return slow;
    }
    public node mergersort(node head){
        if (head == null || head.next == null) {
            return head;
        }
        
        node mid = mid(head);
        node RH = mid.next;
        mid.next = null;

        node nL = mergersort(head);
        node nR = mergersort(RH);

        return merger(nL,nR);
        
    }
    public node merger(node h1, node h2) {
        node head1 = h1;
        node head2 = h2;
        node mergesort_LL = new node(-1);
        node temp_ll = mergesort_LL;
        
        while (head1!=null && head2!=null) {
            if (head1.data<head2.data) {
                temp_ll.next = head1;
                temp_ll = temp_ll.next;
                head1 = head1.next;
            } else {
                temp_ll.next = head2;
                temp_ll = temp_ll.next;
                head2 = head2.next;
                
            }      
            count++;      
        }
        while (head1!=null) {
            temp_ll.next = head1;
            temp_ll = temp_ll.next;
            head1 = head1.next;
            count++;      
        }
        while (head2!=null) {
            temp_ll.next = head2;
            head2 = head2.next;
            temp_ll = temp_ll.next;
            count++;      
        }
        return mergesort_LL.next; 
    }


    public static void main(String[] args) {
        
        mergesort_LL ll = new mergesort_LL();
        ll.addfirst(4);ll.addlast(3);ll.addfirst(1);ll.addlast(8);ll.addfirst(2);ll.addfirst(5);ll.addlast(7);ll.addmid(6, 2);
        ll.print();
        ll.head = ll.mergersort(ll.head);
        ll.print();

    }
}
