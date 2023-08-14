public class LongestCommonSubSequence {
    private int calcLCS(String s1, String s2, int i1, int i2) {
        if((s1.length() == i1) || (s2.length() == i2))
            return 0;
        if(s1.charAt(i1) == s2.charAt(i2))
            return 1 + calcLCS(s1, s2, i1+1, i2+1); // subProblem1
        else {
            int op1 = calcLCS(s1, s2, i1+1, i2);    // subProblem2
            int op2 = calcLCS(s1, s2, i1, i2+1);    // subProblem3
            return Math.max(op1,op2);
        }
    }

    public int calcLCS(String s1, String s2) {
        return calcLCS(s1, s2, 0, 0);
    }
}
