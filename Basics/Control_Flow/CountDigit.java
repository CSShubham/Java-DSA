package Basics.Control_Flow;

public class CountDigit {
    public static void main(String[] args) {
        int n=2;
        int count=0;
        do{
            count++;
            n=n/10;
        }while(n>0);
        System.out.println("number of digits: "+count);
    }
}
