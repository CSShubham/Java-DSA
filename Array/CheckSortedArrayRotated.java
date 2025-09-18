public class CheckSortedArrayRotated {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            // compare with next element (circular using %)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) return false;
        }

        return true;
    }

 
    public static void main(String[] args) {
        CheckSortedArrayRotated sol = new CheckSortedArrayRotated();
        System.out.println(sol.check(new int[]{3,4,5,1,2})); // true
        System.out.println(sol.check(new int[]{2,1,3,4}));   // false
        System.out.println(sol.check(new int[]{1,2,3}));     // true
        System.out.println(sol.check(new int[]{1,1,1}));     // true
    }
}
