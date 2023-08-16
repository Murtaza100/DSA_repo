public class Main {
    public static void main(String[] args) {
        NumberFactor nf = new NumberFactor();
        System.out.println("Using Top Down Approach : ");
        System.out.println(nf.calcWaysTopDown(5));
        System.out.println("using Bottom Up approach : ");
        System.out.println(nf.calcWaysBottomUp(5));
    }
}