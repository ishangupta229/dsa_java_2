public class Fibonacci {
    public static int Fibonacci(int n) {
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int c = Fibonacci(n-1) + Fibonacci(n-2);
        return c;
    }

    public static int Fibonacci_better(int n) {
        int arry[] = new int[n+1];
        arry[0]=0;
        arry[1]=1;
        if (n==0 || n==1) {
            return arry[n];
        }
        arry[n] = Fibonacci_better(n-1) + Fibonacci_better(n-2);
        return arry[n];
    }
    public static void main(String[] args) {
        for (int i = 3; i < 50; i++) {
            System.out.println(i + " - " + Fibonacci_better(i));
        }

        for (int i = 0; i < 50; i++) {
            System.out.println(i + " - " + Fibonacci(i));
        }
        

    }
}
