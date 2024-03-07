import java.util.*;

public class Pair_sum1 {

    public static boolean pair(ArrayList <Integer> list, int target) {
        int l=0,r=list.size()-1;
        while (l<r) {
            if(list.get(r)+list.get(l)== target){
                return true;
            } else if (list.get(r)+list.get(l)< target){
                l++;
            } else if (list.get(r)+list.get(l)> target){
                r--;
            } else{
                return false;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 80;
        System.out.println(pair(list, target));

    }
    
}
