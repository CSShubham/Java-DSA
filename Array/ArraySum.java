import java.util.Arrays;


public class ArraySum {

     static int sumElements(int[] arr){
        int sum=0;
            for(int x:arr){
                sum+=x;
            }
            return sum;
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("Array: " +Arrays.toString(arr));
        System.out.println("sum or elements in array: "+sumElements(arr));
    }
}
