/*
 * Check If String Contains Special Characters
 * ---------------------------------------------
 * Note : Special Characters are every characters exclusing digits,
 * characters and white spaces
 * 
 * Example:
 * ---------
 * input : Murtaza@#1
 * output :
 * @#
 * Murtaza
 * 2
 * Explanation:
 * -------------
 * print special characters in first line, print 
 * string without special character, then in 3rd line print 
 * count of special characters.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckIfStringContainsSpecialCharacters {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String source = br.readLine();
        System.out.println(checkSpecialCharacters(source));
    }

    public static int checkSpecialCharacters(String input) {
        int count = 0; String specialChar = "";
        String inputWithoutSpecialChar = "";
        for(int i=0; i<input.length(); i++) {
            if(!Character.isLetter(input.charAt(i)) && 
                !Character.isDigit(input.charAt(i)) && 
                    ! Character.isWhitespace(input.charAt(i))) {
                        count ++;
                        specialChar += input.charAt(i);
                    }
                    else {
                        inputWithoutSpecialChar += input.charAt(i);
                    }
        }
        System.out.println(specialChar);
        System.out.println(inputWithoutSpecialChar);
        return count;
    }
}
