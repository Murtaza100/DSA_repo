public class ConvertToAnotherString {

    // to convert str 2 into str 1

    private int convertString(String str1, String str2, int indx1, int indx2) {
        if(indx1 == str1.length()) { // str1 ended
            return str2.length()-indx2; // cost of deleting extra characters from str2
        }
        if(indx2 == str2.length()) { // str2 ended
            return str1.length()-indx1; // cost of inserting/adding extra characters to str2 from str1
        }
        if(str1.charAt(indx1) == str2.charAt(indx2))
            return convertString(str1, str2, indx1+1, indx2+1);
        else {
            int deleteOp = 1 + convertString(str1, str2, indx1, indx2+1);
            int replaceOp = 1 + convertString(str1, str2, indx1+1, indx2+1);
            int insertOp = 1 + convertString(str1, str2, indx1+1, indx2);
            return Math.min( deleteOp, Math.min(replaceOp, insertOp));
        }
    }

    public int convertString(String str1, String str2) {
        return convertString(str1, str2, 0, 0);
    }
}
