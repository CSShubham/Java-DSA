public class ClearLastBits {
    public static void main(String[] args) {
         int n = 15;//1111
        System.out.println("\n initial number is = "+n + " in binary= "+ Integer.toBinaryString(n));
        
        int pos= 2;

        int newNum=n&(~0<<pos);
        //int newNum=n;
        // for(int i=0;i<pos;i++){    
        //  newNum = (~(1<<i)) & newNum;
        // }
        
        System.out.println("new number is = "+ newNum + "  in Binary = "+Integer.toBinaryString(newNum));
    }
}
