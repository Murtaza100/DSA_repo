public class Main {
    public static void main(String[] args) {
        LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
        int maxLength = lps.calcLPSLength("ELRMENMET");
        System.out.println(maxLength);
    }
}