import java.util.*;
import java.util.LinkedList;
public class first_noo_rep {
    public static void noRep(String ary) {
        Queue <Character> q = new LinkedList<>(); 
        int i=0;
        int count[] = new int[26];
        while (i<ary.length()) {
            int temp = ary.charAt(i)-97;
            count[temp]++;
            if (count[temp]==1) {
                q.add(ary.charAt(i));
            }
        int rep =0;
        // System.out.println("lol");
        while (rep==0) {
            if (q.isEmpty()) {
                System.out.println("-1");
                rep=1;
            }else{
                char ch = q.peek();
                int t = ch-97;
                if(count[t]>1){
                    q.remove();
                    rep=0;
                    }else{
                    rep = 1;
                    System.out.println(q.peek());
                    }
                }
        }
        i++;
        }
    }    
    public static void main(String[] args) {
        String arr = "aabccxb";
        noRep(arr);
    }
}
