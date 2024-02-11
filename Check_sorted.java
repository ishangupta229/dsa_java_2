public class Check_sorted {
    public static boolean Check_sorted(int arry[],int n){
        if (n==arry.length-1) {
            return true;
        }
        if (arry[n]>arry[n+1]) {
            return false;
        }
        return Check_sorted(arry,n+1);
    }
    public static void main(String[] args) {
        int [] arry = {1,2,3,4,5};
        int [] arry2 = {1,2,3,5,4};
        int [] arry1 = {1};
        System.out.println(Check_sorted(arry, 0));   
        System.out.println(Check_sorted(arry1, 0));   
        System.out.println(Check_sorted(arry2, 0));   
    }
}
