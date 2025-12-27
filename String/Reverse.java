package String;

public class Reverse {

    static String reverseString(CharSequence str) {
        String str2 = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        return str2;
    }

    public static void main(String[] args) {
        String str="Shubham Raj";
        System.out.println("\nreversed string ="+reverseString(str));
    }
}
