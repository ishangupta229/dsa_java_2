public class QuickSort {
    public static void QuickSort(int [] num, int si,int ei) {
        if (si>=ei) {
            return;
        }
        int pi = partition(num,si,ei);

        QuickSort(num, si, pi-1);
        QuickSort(num, pi+1, ei);
    }  
    public static int partition(int []num,int si,int ei) {
        int pivot = num[ei];
        int j  = si-1;
        for (int i = si; i < ei; i++) {
            if (num[i]<pivot) {
                j++;
                int tmp = num[i];
                num [i] = num[j];
                num [j] = tmp;
            }
        }
        j++;
        int tmp = pivot;
        num [ei] = num[j];
        num [j] = tmp;
        return j;

    } 
    public static void print(int[] arry) {
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }
    } 
    public static void main(String[] args) {
        int [] arry = {9,3,6,1,4,8,7,5};
        QuickSort(arry,0,arry.length-1);
        print(arry);
    }
}
