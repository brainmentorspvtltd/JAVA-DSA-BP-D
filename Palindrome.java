public class Palindrome {
    static void palindrome(int org, int rev, int aux){
        if(aux ==0){
            if(org == rev){
                System.out.println("Palindrome ...");
            }
            else{
                System.out.println("Not Palindrome");
            }
            return ;
        }
        // single digit 
        int singleDigit = aux % 10;
        rev = singleDigit + rev * 10;
        aux = aux / 10;
        palindrome(org, rev, aux); // Tail Recursion
    }
    static boolean palindrome2(int org, int rev, int aux){
        if(aux ==0){
            
            return org==rev;
        }
        // single digit 
        int singleDigit = aux % 10;
        rev = singleDigit + rev * 10;
        aux = aux / 10;
        return palindrome2(org, rev, aux);
    }
    public static void main(String[] args) {
        int num = 121;
        //palindrome(num, 0, num);
        System.out.println(palindrome2(num, 0, num)?"Palindrome":"Not Palindrome");
    }
}
