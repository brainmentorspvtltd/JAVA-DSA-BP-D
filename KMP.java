public class KMP {

    // Function to build the LPS array
    public static int[] buildLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m]; // lps[0] =0
        int length = 0;  // Length of the previous longest prefix suffix
        int i = 1;

        // Loop to build the LPS array
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    // If there's a mismatch, reset length to the previous LPS value
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    // Function to perform KMP search
    public static void KMPSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        
        // Build the LPS array for the pattern
        int[] lps = buildLPS(pattern);

        int i = 0;  // Index for text
        int j = 0;  // Index for pattern

        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                System.out.println("Pattern found at index " + (i - j));
                j = lps[j - 1];
            } else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        String text = "abxabcabcabz";
        String pattern = "abcabzc";

        System.out.println("LPS Array: ");
        int[] lps = buildLPS(pattern);
        for (int value : lps) {
            System.out.print(value + " ");
        }
        System.out.println("\n");

        System.out.println("Pattern Matching Output:");
        KMPSearch(text, pattern);
    }
}