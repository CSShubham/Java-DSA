public class SwapNum {
    public static void main(String[] args) {
        int a=8;
        int b=5;
        a^=b;
        b^=a;
        a^=b;
        System.out.println("new number :\n a="+a+" \n b="+b);
        // System.out.println(Integer.toBinaryString(5<<2));
    }
}
