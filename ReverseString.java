public class ReverseString {

    static String reverse(String str){
        // Base case
        if(str.length()==0){
            return "";
        }
       return reverse(str.substring(1)) + str.charAt(0);
        // Small Problem 
        // String smallString = str.substring(1);
        // String smallOutput = reverse(smallString);
        // return smallOutput + str.charAt(0);
    }

    static void palindrome(String org){
        
        System.out.println(reverse(org).equals(org)?"Palindrome String ":"Not Palindrome String");
        // String rev  = reverse(org);
        // System.out.println(rev.equals(org)?"Palindrome String ":"Not Palindrome String");

    }
    public static void main(String[] args) {
       // System.out.println(reverse("amit"));
       palindrome("racecar");
    }
}
