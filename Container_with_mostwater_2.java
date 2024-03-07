import java.util.*;
public class Container_with_mostwater_2 {

    static int max_area;

    public static void ans(ArrayList<Integer> list) {
        int i = 0,j= list.size()-1,width = list.size()-1;
        while (i<=j) {
            max_area = max_area>(Math.min(list.get(i), list.get(j))*width) ? max_area : (Math.min(list.get(i), list.get(j))*width);
            if (list.get(j)>list.get(i)) {
                i++;
            } else{
                j--;
            }
            width--;

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
        // System.out.println(list.size());
        ans(list);
        System.out.println(max_area);
    }

}
