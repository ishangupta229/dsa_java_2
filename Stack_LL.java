
public class Stack_LL {
    public static class node {
        int data;
        node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack {
        public static node head = null;

        public static boolean isEmpty(){
            if (head==null) {
                return true;
            }
            return false;
        }

        public void push(int data){
            node newnode = new node(data);
            if (head==null) {
                head=newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public int pop() {
            if (head==null) {
                return -1;
            }
            int temp = head.data;
            head = head.next;
            return temp;
        }
        public int peek(){
            if (head == null) {
                return -1;
            }
            return head.data;
        }
        // public static void print(){
           
        // }
        
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
