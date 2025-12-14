package Basics.Control_Flow;

public class ReverseNo {
    public static void main(String[] args) {
        int num=665;
        System.out.println("\nOriginal number is : "+num);
        int rev=0;
        while(num>0){
        int rem=num%10;
        rev=rem+rev*10;
        num=num/10;
        }
        System.out.println("reversed number is : "+rev);
    }
}
