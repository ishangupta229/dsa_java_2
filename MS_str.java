
public class MS_str {
    public static void Mergesort(String str[], int si, int ei) {
        if (si>=ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        Mergesort(str,si,mid);
        Mergesort(str,mid+1,ei);
        Merge(str,si,mid,ei);      
    }
    public static void Merge(String str[], int si,int mid,int ei) {
        String tmp[]= new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while (i<=mid && j<=ei) {
            if (str[i].compareTo(str[j])<0) {
                tmp[k++]=str[i++];
            } else{
                tmp[k++]=str[j++];
            } 
        }
        while (i<=mid) {
            tmp[k++]=str[i++];
        }
        while (j<=ei) {
            tmp[k++]=str[j++];
        }

        for (k = 0,i=si ; k < tmp.length; k++, i++) {
            str[i]=tmp[k];            
        }
    }
    public static void print(String[] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] +" ");
        }
    }
    public static void main(String[] args) {
        String [] arr = { "sun", "earth", "mars", "ishan", "hello" , "mercury"};
        Mergesort(arr, 0, arr.length-1);
        print(arr);
    }
}
