package Basics.Control_Flow.Pattern;

public class Pattern1 {
    // basic pyramid
    public static void main(String[] args) {
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }
}
