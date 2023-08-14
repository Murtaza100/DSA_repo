public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1,1,1,1,0,0};
        int[] arr2 = {1,0,0,0,0};
        int[] arr3 = {0, 0, 0};
        int[] arr4 = {1, 1, 1, 1};
        System.out.println("using method 1:");
        System.out.println(CountZeroes.countZeroes(arr1));
        System.out.println(CountZeroes.countZeroes(arr2));
        System.out.println(CountZeroes.countZeroes(arr3));
        System.out.println(CountZeroes.countZeroes(arr4));
        System.out.println("\nusing method 1:");
        System.out.println(CountZeroes.countZeroes(arr1, arr1.length-1));
        System.out.println(CountZeroes.countZeroes(arr2, arr2.length-1));
        System.out.println(CountZeroes.countZeroes(arr3, arr3.length-1));
        System.out.println(CountZeroes.countZeroes(arr4, arr4.length-1));
    }
}