import java.util.*;
public class Array_queue {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            rear = -1;
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if (rear == size-1) {
                System.out.println("Cannot add");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        public static int remove() {
            if (rear==-1) {
                System.out.println("Queue is empty.");
                return -1;
            }
            int temp = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i]=arr[i+1];
            }
            rear--;
            return temp;            
        }
        
        public static int peek(){
            if (rear==-1) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[rear];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(0);
        q.add(5);
        q.add(1);

        q.add(2);

        while (!q.isEmpty()) {
            System.out.println(q.remove());            
        }
    }
}
