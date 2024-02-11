public class Mergesort {
    public static void Mergesort(int[] num, int si,int ei) {
        if (si>=ei) {
            return;            
        }
        int mid = si + (ei-si)/2 ;
    
        Mergesort(num,si,mid);
        Mergesort(num,mid+1,ei);

        Merge(num,si,mid,ei);
    }

    public static void Merge(int [] num, int si, int mid, int ei) {
        int arry[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while (i<=mid && j<=ei) {
            if (num[i]<num[j]) {
                arry[k++]=num[i++];
            } else{
                arry[k++]=num[j++];
            }
        }

        while (i<=mid) {
            arry[k++]=num[i++];                
        }
        while (j<=ei) {
            arry[k++]=num[j++];                
        }

        for(k = 0 , i = si; i <=ei; k++, i++) {
            num [i] = arry[k];
        }
        
    }

    public static void print(int[] arry) {
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arry = {5,3,7,1,9,4,-9,-1,2};
        Mergesort(arry,0,arry.length-1);
        print(arry);

    }
}
