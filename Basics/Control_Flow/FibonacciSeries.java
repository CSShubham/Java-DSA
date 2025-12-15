package Basics.Control_Flow;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n =5;
        int first=0;
        int second=1;
        for(int i=0;i<=n;i++){
            if(i==0){
                System.out.println(first);
            }
            else if(i==1){
                System.out.println(second);
            }
            else{
                int next=first+second;
                first=second;
                second=next;
                System.out.println(next);
            }
            
        }
    }
}
