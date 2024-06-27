
public class secondAttemptGCDOfStrings {

    public static void main (String args []){
//        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
//        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
//        String str1 = "ABCABCABC";
//        String str2 = "ABC";
//        String str1 = "AABB";
//        String str2 = "AB";
        String str1 = "OBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNO";
        String str2 = "OBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNOOBCNO";
        secondAttemptGCDOfStrings gcdOfStrings = new secondAttemptGCDOfStrings();
        System.out.println("The output is "+ gcdOfStrings.gcdOfStrings(str1, str2));


    }
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // Compute the greatest common divisor of lengths
        int gcdLength = gcd(len1, len2);

        // Extract potential gcd string
        String gcdString = str1.substring(0, gcdLength);

        // Check if both strings can be formed by repeating gcdString
        if (str1.equals(repeatString(gcdString, len1 / gcdLength)) &&
            str2.equals(repeatString(gcdString, len2 / gcdLength))) {
            return gcdString;
        } else {
            return "";
        }
    }

    // Helper function to repeat a string n times
    private static String repeatString(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    // Helper function to find the greatest common divisor using Euclidean algorithm
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            System.out.println("b"+b);
            a = temp;
        }
        System.out.println("a"+a);
        return a;
    }
}
