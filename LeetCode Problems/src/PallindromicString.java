public class PallindromicString {
    // variables to hold the value of start index and length of pallindrome from there
    static int resultStart = 0;
    static int resultLength = 0;
    public static void findPallindromeLengthFromMiddleIndex(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--; end++;
        }
        if(resultLength < end-start-1) {
            resultStart = start + 1;
            resultLength = end-start-1;
        }
    }
    public static String longestPallindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        for (int i = 0 ; i < s.length()-1 ; i++) {
            // for odd numbered length of string
            findPallindromeLengthFromMiddleIndex(s, i, i);
            // for even string length
            findPallindromeLengthFromMiddleIndex(s, i, i + 1);
        }
        return s.substring(resultStart, resultStart + resultLength);
    }
    public static void main(String[] args) {
        String  s = "xyzabcdfggfdcbazyz";
        System.out.println(longestPallindrome(s));
    }
}
