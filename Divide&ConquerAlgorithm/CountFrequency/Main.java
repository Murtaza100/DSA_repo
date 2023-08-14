public class Main {
    public static void main(String[] args) {
        System.out.println(CountFreq.countSortedFrequency(
            new int[]{1, 1, 2, 2, 2, 2, 3}, 2));
        System.out.println(CountFreq.countSortedFrequency(
            new int[]{1, 1, 2, 2, 2, 2, 3}, 3));
        System.out.println(CountFreq.countSortedFrequency(
            new int[]{1, 1, 2, 2, 2, 2, 3}, 4));
        System.out.println(CountFreq.countSortedFrequency(
            new int[]{}, 4));
    }
}