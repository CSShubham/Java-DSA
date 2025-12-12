public class SetBitOp {
    public static void main(String[] args) {
        int n =5 ; //0101
        System.out.println("\n initial number is = "+n + " in binary= "+ Integer.toBinaryString(n));
        int pos =1;

        int newNumber= (n | (1<<pos));
        String  bin =Integer.toBinaryString(newNumber);
        System.out.println("\n new Number is "+newNumber + " also in binary= "+bin);
    }
}
