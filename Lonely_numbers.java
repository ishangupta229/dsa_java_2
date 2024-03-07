import java.util.*;
public class Lonely_numbers {
    public static void lonely_numbers(ArrayList <Integer> list) {
        list.sort(null);
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i)-list.get(i+1)==1 || list.get(i+1)-list.get(i)==1 || list.get(i+1)-list.get(i)==0 ) {
                // System.out.println(list);
                list.remove(i);
                list.remove(i);
                // System.out.println(list);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(3);


        lonely_numbers(list1);
    }
}
