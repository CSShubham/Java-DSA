public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 45, 67, 89, 23, 99, 54};
        
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("Largest element: " + max);
    }
}
