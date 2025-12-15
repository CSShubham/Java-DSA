package Basics.Control_Flow;
public class Palindrome {
    public static void main(String[] args) {
        int n=1231;
        int temp=n;
        int rev=0;
        while(temp>0){
                int rem=temp%10;
                rev=rem+rev*10;
                temp=temp/10;
        }
        if(rev==n){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}
