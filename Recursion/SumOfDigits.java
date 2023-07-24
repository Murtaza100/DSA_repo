public class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits sum = new SumOfDigits();
        System.out.println(sum.calSum(111));
    }
    public int calSum(int digit) {
        int sum = 0;
        if(digit < 0)
            return -1;
        if(digit == 0)
            return 0;
        sum += digit%10 + (calSum(digit/10)); 
        return sum;
    }
}
