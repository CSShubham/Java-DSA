public class PowerOfTwo {
    public static void main(String[] args) {
        int num =8;
        boolean istrueorfalse = (num>0)&&((num&(num-1))==0);
        System.out.println("is number a power of 2 ? = "+istrueorfalse );
    }
}
