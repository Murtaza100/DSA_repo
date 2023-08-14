public class NumberFactor {
    static int calcWays(int n) {
        if((n==0) || (n==1) || (n==2))
            return 1;
        if(n==3)
            return 2;
        int subProb1 = calcWays(n-1);
        int subProb2 = calcWays(n-3);
        int subProb3 = calcWays(n-4);
        return subProb1+subProb2+subProb3;
    }
}
