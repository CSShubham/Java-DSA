public class ClearBitOp {
    public static void main(String[] args) {
        int n = 5;//0101
        System.out.println("\n initial number is = "+n + " in binary= "+ Integer.toBinaryString(n));
        int pos= 0;
        int newNumber = ((~(1<<pos)) & n);
        System.out.println("new number is = "+ newNumber + "  in Binary = "+Integer.toBinaryString(newNumber));

    }
}
