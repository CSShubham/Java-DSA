package String;

public class Palindrome {

    static Boolean isStringPalindrome(CharSequence str) {
        String str2 = "";
        

        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        return str2.equals(str);
    }

    public static void main(String[] args) {
        String str="madam";
        System.out.println("is string palindrome: "+isStringPalindrome(str));
        String str1="java";
        System.out.println("is string palindrome: "+isStringPalindrome(str1));
    }
}