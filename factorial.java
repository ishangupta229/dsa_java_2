import java.util.*;
public class factorial {
    public static int factorial(int num) {
        if(num==0){
            return 1;
        }
        int an = num * factorial(num-1);
        return an;
    }

    public static void main(String[] args) {
     System.out.println(factorial(5));

    }
}
