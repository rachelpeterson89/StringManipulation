// Create a StringManipulator class that implements some methods.
public class StringManipulator {
    // Methods inside of the class.

    // trimAndConcat(String, String): Trim both input strings and then concatenate them. Return the new string.
    public String trimAndConcat(String str1, String str2) {
        String newStr1 = str1.trim();
        String newStr2 = str2.trim();
        String newStr = newStr1.concat(newStr2);
        return newStr;
    }

    // getIndexOrNull(String, char): Get the index of the character and return either the index or null.
    public Integer getIndexOrNull(String str, char letter) {
        int idx = str.indexOf(letter, 0);
        if( idx == -1) {
            return null;
        }
        return idx;
    }

    // getIndexOrNull(String, String): Get the index of the start of the substring and return either the index or null.
    public Integer getIndexOrNull(String str1, String str2) {
        int strIdx = str1.indexOf(str2, 0);
        if( strIdx == -1 ) {
            return null;
        }
        return strIdx;
    }

    // concatSubstring(String, int, int, String): Get a substring using a starting and ending index, and concatenate that with the second string input to our method.
    public String concatSubstring(String leftStr, int startIdx, int endIdx, String rightStr) {
        String newLeftStr = leftStr.substring(startIdx, endIdx);
        String newSubStr = newLeftStr.concat(rightStr);
        // String myString = "world";
        // String newSubStr = leftStr + myString;
        return newSubStr;
    }
}