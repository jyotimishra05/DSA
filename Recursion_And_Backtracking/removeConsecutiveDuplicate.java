public class removeConsecutiveDuplicate {
    public static String removeConsecutiveDuplicates(String s) {
        if (s.length() <= 1) {
            return s;
        }
        
        // Check if the first character is the same as the second character
        if (s.charAt(0) == s.charAt(1)) {
            // If they are the same, skip the first character and recursively call the function on the substring starting from the second character
            return removeConsecutiveDuplicates(s.substring(1));
        } else {
            // If the first character is different from the second character, append it to the result and recursively call the function on the substring starting from the second character
            return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aabccdeffgh"));
    }
}
