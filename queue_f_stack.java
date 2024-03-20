import java.util.*;
public class queue_f_stack {
    static class queue{
        static Stack <Integer> s1 = new Stack<>();
        static Stack <Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.empty() && s2.empty();
        }
        public static void push(int data){
            if (isEmpty()) {
                s1.push(data);
                
                return;
            }
            if (!s1.isEmpty()) {
                s1.push(data);
                
            } else{
                s2.push(data);
                
            }
        }
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = 0;
            
            while(!s1.isEmpty()) {
                top = s1.pop();
                // System.out.println(top + "top");
                if (!s1.isEmpty()) {
                    s2.add(top);
                }
            }
            while (!s2.isEmpty()) {
                int tmp = s2.pop();
                s1.add(tmp);
            }
            
            return top;
        }
    }

     public static void main(String[] args) {
        queue q = new queue();
        q.push(0);
        q.push(1);
        q.push(2);
        q.push(3);
        while (!q.isEmpty()) {
            System.out.println(q.pop());
        }
        System.out.println(q.pop());
     }
}
