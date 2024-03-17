import java.util.*;

public class LL_queue { //fifo

    public static node head;
    public static node rear;

    public static class node {
        int data;
        node next;
        
        node (int data){
            this.data=data;
            this.next=null;
        }

        public static boolean isEmpty(){
            return head == null;
        }

        public static void add(int data){
            node newnode = new node(data);
            if (head==null) {
                rear = head = newnode;
                return;
            }
            rear.next = newnode;
            rear = newnode;
        }
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            int temp = head.data;
            head = head.next;
            return temp;
        }
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        node q = new node(0);
        System.out.println(q.isEmpty());
        q.add(8);
        q.add(2);
        q.add(1);
        System.out.println(q.isEmpty());
        q.add(7);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
