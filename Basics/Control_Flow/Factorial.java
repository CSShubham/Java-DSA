package Basics.Control_Flow;

public class Factorial {
    public static void main(String[] args) {
        int n=4;
        int temp=n;
        int fact=n;
        while(n>1){
            fact=fact*(n-1);
            n--;
        }
        System.out.println("factorial of "+ temp +" is : "+fact);
    }
}
