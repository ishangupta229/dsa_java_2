import java.util.*;
public class Container_with_mostwater{
    static int count;

    public static void print(int ary[]) {
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");

        }
        System.out.println();
    }

    public static void ans(ArrayList <Integer> list) {
        for (int i = 0; i <list.size()-1; i++) {
            int width = 1;
            for (int j = i+1; j < list.size(); j++) {
                count = count>(Math.min(list.get(i),list.get(j))*width) ? count:(Math.min(list.get(i),list.get(j))*width);
                width++;
            }
        }
    }
  
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        ans(list);
        System.out.println(count);
    }
}
