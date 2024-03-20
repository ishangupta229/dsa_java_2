import java.util.*;
import java.util.LinkedList;
public class haves_s {
    public static void haves_s(Queue<Integer> q1) {
        Queue <Integer> q2 = new LinkedList<>();
        int temp =(q1.size())/2;
        for (int i = 0; i < temp ; i++) {
            q2.add(q1.remove());
        }
        Queue <Integer> q3 = new LinkedList<>();
        for (int i = 0; i < temp; i++) {
            q3.add(q2.remove());
            q3.add(q1.remove());
        }
        
        while (!q3.isEmpty()) {
            System.out.println(q3.remove());
        }
    }
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        haves_s(q);
    }
}
