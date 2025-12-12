public class CountSetBits {
 public static void main(String[] args) {
    int n=5;//0101
    int count = Integer.bitCount(n);
    //can also be done using Brian Kernighan’s Algorithm (i will learn later!!)
    System.out.println(" number of set bits(1s)= "+count);
 }   
}
