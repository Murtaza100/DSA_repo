public class Main {
    public static void main(String[] args) {
        LongestCommonSubSequence lcs = new LongestCommonSubSequence();
        int longestLCS = lcs.calcLCS("elephant", "erepat");
        System.out.println(longestLCS);
    }
}