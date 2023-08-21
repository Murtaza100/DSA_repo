/*
 * Longest prefix which is also suffix
 * 
 * Given a string s, find the length of the longest prefix, which is also a suffix. 
 * The prefix and suffix should not overlap.

Examples: 

Input : S = aabcdaabc
Output : 4
Explanation: The string “aabc” is the longest prefix which is also suffix.

Input : S = abcab
Output : 2

Input : S = aaaa
Output : 2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Longestprefixwhichisalsosuffix {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String toCheck = br.readLine();
        //System.out.println(findPrefixSuffixLength(toCheck));
        System.out.println(longestPrefixSuffix(toCheck));
    }

    // O(n^2)tc
    /*
     * Since overlapping prefixes and suffixes is not allowed, 
     * we break the string from the middle and start matching 
     * left and right strings. If they are equal return size of 
     * one string, else they try for shorter lengths on both sides.
     */
    public static int findPrefixSuffixLength(String toCheck) {
        int n = toCheck.length();
        if(n < 2)
            return 0;
        int len = 0;
        int i = (n + 1)/2;
        while(i < n) {
            if(toCheck.charAt(i) == toCheck.charAt(len)) {
                len++; i++;
            }
            else {
                i = i - len + 1;
                len = 0;
            }
        }
        return len;

    }

    // using KPM algorithms in O(N) tc and O(N) sc
    /*
     * The idea is to use the preprocessing algorithm KMP search. 
     * In the preprocessing algorithm, we build lps array which 
     * stores the following values.

    lps[i] = the longest proper prefix of pat[0..i] 
    which is also a suffix of pat[0..i].
     */
    static int longestPrefixSuffix(String s)
    {
        int n = s.length();
     
        int lps[] = new int[n];
        //lps[0] = 0; -> not needed as in java bydefault all ele are 0
        int len = 0;
        int i = (n+1)/2; // i=1 if The prefix and suffix should allowed to overlap
        while (i < n)
        {
            if (s.charAt(i) == s.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else
            {
                if (len != 0)
                {
                    len = 0; // lps[len-1];
                }
                else
                {
                    //lps[i]=0; -> not needed as in java bydefault all ele are 0
                    i++;
                }
            }
        }
     
        int res = lps[n-1];
        return res;
    }
}
