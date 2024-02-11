public class tower_of_hanoi{
    static int count;
    public static void toh(int num,String a,String c,String b) {
        if (num<=0) {
            return;
        }
        toh(num-1, a, b, c);
        System.out.println("Moving " + num + " from " + a + " to "+ c);
        count++;
        toh(num-1, b, c, a);
    }
    public static void main(String[] args) {
        toh(3, "Start", "End", "Help");
        System.out.println(count);
    }
}
