import java.util.*;
public class Monotone {

    public static boolean Monotone(ArrayList <Integer> list) {
        int n = list.size()-1,i=0;
        if (list.get(i)<list.get(n)) {
            for (int j = 1; j <= n; j++) {
                if (list.get(j-1)>list.get(j)) {
                    return false;
                }
            }
        }else{
            for (int j = 1; j < n; j++) {
                if (list.get(j-1)<list.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        ArrayList <Integer> list3 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        
        list2.add(6);
        list2.add(5);
        list2.add(4);
        list2.add(4);

        list3.add(1);
        list3.add(3);
        list3.add(2);

        System.out.println(Monotone(list1));
        System.out.println(Monotone(list2));
        System.out.println(Monotone(list3));
    }
}
