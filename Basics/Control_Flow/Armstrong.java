package Basics.Control_Flow;

public class Armstrong {

    static int digitLength(int n){  
        int count=0;
        do{
            count++;
            n=n/10;
        }while(n>0);

        return count;
    }
    static boolean isArmstrong(int n){
        int temp=n;
        int length=digitLength(n);      //int digits = String.valueOf(n).length();
        int sum=0;
        for(int i=1;i<=length;i++){
            int rem=n%10;
            sum=sum+((int)Math.pow(rem, length));
            n=n/10;
        }
        if(sum==temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        if(isArmstrong(153)){
            System.out.println("yes, it is armstrong");
        }
        else{
            System.out.println("NO, it is not armstrong");
        }
    }
}
