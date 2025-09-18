public class CheckSortedArray {
    public static boolean isSorted(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4, 5};

        System.out.println(isSorted(arr1, arr1.length)); // True
        System.out.println(isSorted(arr2, arr2.length)); // False
    }
}
