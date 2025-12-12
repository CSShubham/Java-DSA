
class GetBitOp{
    public static void main(String[] args){
        int n = 5;  //0101
        int pos = 3;
        int bitMask = 1<<pos;

        if((n & bitMask) == 0){
            System.out.println("bit found is 0");
        }
        else{
            System.out.println("bit found is 1");
        }


    }
}