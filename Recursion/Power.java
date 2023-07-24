public class Power {
    public static void main(String[] args) {
        System.out.println(power(2, 0));
    }
    public static int power(int base, int pow) {
        if(pow < 0)
            return -1;
        if(pow == 1) {
            return base;
        }
        else if(pow == 0){
            return 1;
        }
        return (base * power(base, pow-1));
        // x^(a+b) = x^a * x^b => x^(3) = x^(1+2) = x^1*x^(3-1 i.e, 2)
    }
}
