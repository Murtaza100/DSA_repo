public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(DecToBin(10));
    }
    public static int DecToBin(int n) {
        if(n<0)
            return -1;
        if(n==1)
            return 1;
        return n%2 + 10*(DecToBin(n/2));
        /*
         * 10 => 10/2, rem 0, 0+10*101 = 1010
         * 5/2, rem 1, 1+10*10 = 101
         * 2/2, rem 0, 0 + 10*1 = 10
         * 1/2, rem 1 => 1
         */
    }
}
