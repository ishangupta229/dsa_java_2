import java.util.*;
public class Mostwater {
    static int count;

    public static void print(int ary[]) {
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");

        }
        System.out.println();
    }

    public static int[] maixmum(ArrayList <Integer> list, boolean a) {
        int list1[] = new int[list.size()];
        int temp = Integer.MIN_VALUE;
        if (a) {
            list1[0] = list.get(0);
            for (int i = 0; i < list1.length; i++) {
                temp = temp>list.get(i) ? temp:list.get(i);
                list1[i] = temp;
            }
        } else {
            list1[list1.length-1] = list.get(list.size()-1);
            for (int i = list1.length-1; i>0 ; i--) {
                temp = temp>list.get(i) ? temp:list.get(i);
                list1[i] = temp;
            }
        }

        return list1;
    }


    public static void water(ArrayList <Integer> list) {
        int L_max[] = maixmum(list,true);
        int R_max[] = maixmum(list,false);

        print(L_max);
        print(R_max);

        for (int i = 1; i < list.size()-1; i++) {
            int temp = Math.min(L_max[i], R_max[i]);
            count += temp; 
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
        System.out.println(list);
        water(list);
        System.out.println(count);
    }
}
