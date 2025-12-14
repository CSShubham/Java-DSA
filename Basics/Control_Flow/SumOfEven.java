package Basics.Control_Flow;

public class SumOfEven {
    public static void main(String[] args) {
        int n=12;
        int sum=0;
        for(int i=1;i<=n;i++){
            if((i&1)==0){
            sum=sum+i;
            }
        }
        System.out.println("Sum of even Number from 1 to "+n+" is: "+sum);
    }
}
