/*
 * Check for string rotation
 * --------------------------
 * Given two strings s1 and s2, write a snippet to check 
 * whether s2 is a rotation of s1. Strings may contain 
 * duplicates. 
 * 
 * Examples:
---------------
Input :  s1 = "ABCD", s2 = "CDAB"
Output : True
String s1 is rotation of s2.

Input :  s1 = "ABAD", s2 = "ADAB"
Output : True

Input : s1 = ABCD, and s2 = ACBD 
Output : False
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckForStringRotation {
      public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String source = br.readLine();
        String toCheck = br.readLine();
        System.out.println(checkRotation(source, toCheck));
    }

    public static boolean checkRotation(String source, String toCheck) {
        String concatenatedSource = source + source;
        if(source.length() == toCheck.length()) {
            if(concatenatedSource.indexOf(toCheck)!=-1)
                return true;
        }
        return false;
    }
}
