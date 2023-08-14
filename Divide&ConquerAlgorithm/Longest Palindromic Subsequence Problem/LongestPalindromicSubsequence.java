public class LongestPalindromicSubsequence {
    private int calcLPSLength(String str, int start, int end) {
        if(start > end) 
            return 0;
        if(start == end)
            return 1;
        if(str.charAt(start) == str.charAt(end))
            return 2 + calcLPSLength(str, start+1, end-1); // subproblem1
        else {
            int op1 = calcLPSLength(str, start+1, end); // subproblem2
            int op2 = calcLPSLength(str, start, end-1); // subproblem3
            return Math.max(op1, op2);
        }
    }

    public int calcLPSLength(String str) {
        return calcLPSLength(str, 0, str.length()-1);
    }
}
