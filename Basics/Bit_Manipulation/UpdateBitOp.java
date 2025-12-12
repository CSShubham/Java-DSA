import java.util.Scanner;

public class UpdateBitOp {
    public static void main(String[] args) {
        int n =5;//0101
        String str=Integer.toBinaryString(n);
        System.out.println("initial number is: "+str);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation to perform: \n 1.set \n2.clear \n(enter : 1/2) :: )");
        int oper = sc.nextInt();
        System.out.println("enter position you want to operate :");
        int pos=sc.nextInt();
        if (pos>str.length()-1){
            System.out.println("invalid position");
        }
        else{
            int bitMask=1<<pos;
            if(oper==1){
                //set
                int newNumber= bitMask | n ;
                System.out.println("new Number is : "+ Integer.toBinaryString(newNumber) );
            }
            else if(oper==2){
                int newNumber=(~(bitMask)&n);
                System.out.println("new Number is : "+ Integer.toBinaryString(newNumber) );
            }
        
        }
        sc.close();
    }
    
}
