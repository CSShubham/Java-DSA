import java.util.Scanner;

class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int org = x;
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return rev == org;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrome p = new Palindrome();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (p.isPalindrome(num)) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is NOT a Palindrome.");
        }

        sc.close();
    }
}
