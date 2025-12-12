public class ToggleBitOp {
     public static void main(String[] args) {
        int num = 10;  // 1010
        int k = 2;     // toggle 1st bit

        int result = num ^ (1 << k);

        System.out.println("Original: " + num);
        System.out.println("After Toggling: " + result); //1110
    }
}
