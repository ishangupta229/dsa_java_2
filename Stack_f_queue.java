import java.util.*;
import java.util.LinkedList;

public class Stack_f_queue {
    static class stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else if (!q2.isEmpty()) {
                q2.add(data);
            } else{
                q1.add(data);
            }
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println(q2.isEmpty());
                System.out.println("Empty");
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    // System.out.println(top);
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else{
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(2);
        s.push(1);
        s.push(3);
        s.push(4);
        System.out.println(s.isEmpty());
        System.out.println();
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
