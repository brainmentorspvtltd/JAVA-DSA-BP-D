public class NumberToString {
    static String numbers [] = {"zero", "one","two","three","four","five","six","seven","eight","nine"};
    static String numberToString(int num){
        // Base case
        if(num == 0){
            return "";
        }
        // Small Problem
        String str = numberToString(num/10);
       return str + numbers[num % 10] + " ";
    }
    public static void main(String[] args) {
        System.out.println(numberToString(436));
        // o/p - Four Three Six
    }
}
