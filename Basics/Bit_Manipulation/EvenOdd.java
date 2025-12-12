import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n enter number: ");
        int num = sc.nextInt();

        if((num&1)==0){
            System.out.println("Even ");
        }
        else {
            System.out.println("odd");
        }
        sc.close();
    }

}
