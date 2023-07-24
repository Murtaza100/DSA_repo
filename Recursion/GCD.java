public class GCD {
    public static void main(String[] args) {
        System.out.println(calcGCD(12, 36));
    }
    public static int calcGCD (int a, int b) {
        /*
        Euclidean algorithm
        ----------------------
        case : 8, 4 => 8/4 = 2, rem = 0
        4/0 => in such condition 4 will be ans.

        case : 12, 5 => 12/5 = 2, rem = 2
        5/2 = 2, rem = 1
        2/1 = 2, rem = 0
        1/0 => ans = 1
        */

        if(b<0 || a<0)
            return -1;
        if(b==0)
            return a;
        return calcGCD(b, a%b);
    }
}
