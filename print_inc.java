public class print_inc {
    public static void print_inc(int n) {
        if (n==1) {
            System.out.print(n + " ");
            return;
        }
        print_inc(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        print_inc(30);
    }
}


