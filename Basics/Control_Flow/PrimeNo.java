package Basics.Control_Flow;

public class PrimeNo {

   static boolean isPrime(int x){
        for(int i=2;i<x;i++){
            if((x%i)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        if(isPrime(7)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
