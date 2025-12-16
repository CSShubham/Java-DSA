import java.util.Arrays;

public class ArrangeArray {

    static void Arrange(int[] arr){
        int[] newarr=Arrays.copyOf(arr, arr.length);
        int first =0;
        int last=arr.length-1;
        for(int i=0;i<=arr.length-1;i++){
            if(i%2==0||i==0){
                newarr[first]=arr[i];
                first++;
            }
            else{
                newarr[last]=arr[i];
                last--;
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("Array: " +Arrays.toString(arr));
        Arrange(arr);
    }
}
