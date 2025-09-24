import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums); // sort the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true; 
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 1};

        System.out.println("arr1 contains duplicate? " + hasDuplicate(arr1)); // false
        System.out.println("arr2 contains duplicate? " + hasDuplicate(arr2)); // true
    }
}
