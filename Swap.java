import java.util.*;

public class Swap {

    public static void print(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);

        //swapping index 2,4
        print(list);
        int temp = list.get(2);

        list.set(2,list.get(4));
        list.set(4,temp);
        print(list);

        Collections.sort(list);
        print(list);
        
    }    
}
