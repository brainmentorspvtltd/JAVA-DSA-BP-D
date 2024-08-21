/*
 * What is String in Java?
 * 1. Collection of chars
 * 2. Immutable Data type
 * 3. String Maintain String Pool
 */
public class StringDemo {
    public static void main(String[] args) {
        int x = 10; // int literal
        float e = 190.20f; // float literal
        String r = "Amit".intern(); // String Literal (1 or 0)
        String r2 = new String("Amit").intern(); // 2 or 1
        //Integer r2 =10;
        String r3 = "Amit"; // "Amit".intern()
        System.out.println(r == r3);
        System.out.println(r == r2);
        // In Built DS - Objects Work
        System.out.println(r.toUpperCase());
        char t = r.charAt(0);
        System.out.println(r.charAt(0));
        System.out.println(r.substring(1));
        System.out.println(r.equals(r3));
        System.out.println(r.substring(1,2));
        System.out.println(r.equalsIgnoreCase(r3));
        System.out.println(r.compareTo(r3));
    }
}
