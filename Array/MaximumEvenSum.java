import java.util.*;

public class MaximumEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long ans = -1;

            // k = 1
            long sum1 = a + b;
            if (sum1 % 2 == 0) ans = Math.max(ans, sum1);

            // k = b
            long sum2 = a * b + 1;
            if (sum2 % 2 == 0) ans = Math.max(ans, sum2);

            // k = 2 (only if b divisible by 2)
            if (b % 2 == 0) {
                long sum3 = a * 2 + b / 2;
                if (sum3 % 2 == 0) ans = Math.max(ans, sum3);
            }

            // k = b/2 (only if b divisible by 2)
            if (b % 2 == 0) {
                long sum4 = a * (b / 2) + 2;
                if (sum4 % 2 == 0) ans = Math.max(ans, sum4);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
