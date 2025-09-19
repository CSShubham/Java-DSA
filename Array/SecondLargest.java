class SecondLargest {
    public int secondLargest(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        SecondLargest sol = new SecondLargest();

        int[] nums1 = {8, 8, 7, 6, 5};
        System.out.println(sol.secondLargest(nums1)); // 7

        int[] nums2 = {10, 10, 10, 10};
        System.out.println(sol.secondLargest(nums2)); // -1

        int[] nums3 = {7, 7, 2, 2, 10, 10, 10};
        System.out.println(sol.secondLargest(nums3)); // 7
    }
}
