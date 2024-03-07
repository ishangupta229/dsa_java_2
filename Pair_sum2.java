import java.util.*;

public class Pair_sum2 {

    public static boolean pair(ArrayList <Integer> list, int target) {
        int i = 0;
        for (i = 0; i < list.size()-1; i++) {
            if(list.get(i+1)<list.get(i)){
                break;
            }
        }
        int r=i, l=i+1, n =list.size();
        while (l!=r) {
            if(list.get(r)+list.get(l)== target){
                return true;
            } else if (list.get(r)+list.get(l)< target){
                // if (l==list.size()-1) {
                //     l=0;
                // } else{
                //     l++;
                // }

                l = (l+1)%n;

            } else if (list.get(r)+list.get(l)> target){
                // if (r==0) {
                //     r=list.size()-1;
                // } else{
                //     r--;
                // }

                r = (n+r-1)%n;

            }

        }
        return false;


    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 14;
        System.out.println(pair(list, target));

    }
    
}
