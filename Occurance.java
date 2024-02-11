public class Occurance {
    public static void first_occurance(int arry[],int key,int i) {
        if(arry[i]==key){
            System.out.println(i);
            return;
        }
        if(i==arry.length-1){
            System.out.println("Not in array");
            return;
        }
        first_occurance(arry, key, i+1);        
    }

    public static void last_occurance(int arry[],int key,int i) {

        if(arry[i]==key){
            System.out.println(i);
            return;
        }
        if(i==0){
            System.out.println("Not in array");
            return;
        }
        last_occurance(arry, key, i-1);
        
    }

    public static void main(String[] args) {
        int arry[] = {1,2,3,4,5,6,7,8,9,5,2,4,7};
        first_occurance(arry, 5, 0);
        last_occurance(arry, 5, arry.length-1);
    }
}
