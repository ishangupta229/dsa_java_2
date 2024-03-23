import java.lang.reflect.Array;
import java.util.*;
public class Choco {
    static int cost;
    public static void peices(Integer [] CostVer, Integer []CostHor ) {
        int hp=1,vp=1;
        int h=0,v=0;
        while (h<CostHor.length && v< CostVer.length) {
            if (CostVer[v]>=CostHor[h]) {
                cost += (vp*CostVer[v]);
                v++;
                hp++;
            }else{
                cost += (hp*CostHor[h]);
                h++;
                vp++;
            }            
        }
        while (v< CostVer.length){
            cost += (vp*CostVer[v]);
            v++;
            hp++;
        }
        while (h<CostHor.length){
            cost += (hp*CostHor[h]);
            h++;
            vp++;
        }
        System.out.println(vp);
    }
    public static void main(String[] args) {
        int n =4, m=6;
        Integer CostVer[] = {2,1,3,1,4};
        Integer CostHor[] = {4,1,2};

        Arrays.sort(CostHor, Collections.reverseOrder());
        Arrays.sort(CostVer, Collections.reverseOrder());

        peices(CostVer, CostHor);
        System.out.println(cost);
    }
}
