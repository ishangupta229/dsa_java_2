public class printn {
    public static void printdec(int num) {
        if(num==1){
            System.out.println(num);
            return;
        }
        System.out.print(num + " ");
        printdec(num-1);

    }
    public static void main(String[] args) {
        printdec(100);
    }
}
