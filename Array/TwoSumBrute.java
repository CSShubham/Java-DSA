import java.util.Scanner;

class TwoSumBrute {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2]; // to store result
        for(int i = 0; i < nums.length; i++ ){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    return res; 
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // TwoSumBrute sol = new TwoSumBrute();
        int[] result = twoSum(nums, target);

      
        if(result.length == 0){
            System.out.println("No pair found!");
        } else {
            System.out.println("[ " + result[0] + ", " + result[1] + " ]");
        }

        sc.close();
    }
}
