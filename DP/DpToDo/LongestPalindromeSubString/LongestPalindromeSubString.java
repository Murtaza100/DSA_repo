/*
 * Longest Palindromic Substring
 * ------------------------------
- We are given a String.
- We need to find its Longest Palindromic Substring (LPS) in 
  the given String using Dynamic Programming.

A substring is a contiguous sequence of characters within a 
string.

Palindrome is a string that reads the same backward as well 
as forward.

Example
--------
Input: BABAD

Output: 3

LPS is "BAB"

 */
public class LongestPalindromeSubString {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("BABAD"));
    }
    public static String longestPalindrome(String s) {
        int length = s.length();
        String res = s.substring(0, 1);
        for(int i = 0; i < length; i++) {
            // base case (i, i) and (i, i + 1);
            String ps = getPalindrome(s, i, i);
            res = (ps.length() > res.length()) ? ps : res;
            ps = getPalindrome(s, i, i + 1);
            res = (ps.length() > res.length()) ? ps : res;
        }
        System.out.println(res.length());
        return res;
    }
    // expand aroung center
    private static String getPalindrome(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l + 1, r);   
    }
}
