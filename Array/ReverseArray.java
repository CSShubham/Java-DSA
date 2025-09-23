class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        int start = 0;
        int end = nums.length - 1;

        // Two-pointer approach
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

        // Print reversed array
        System.out.print("Reversed Array: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
