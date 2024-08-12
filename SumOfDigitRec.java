public class SumOfDigitRec {

    static int sumOfDigit(int num){
        if(num ==0 ){
            return 0;
        }
        int sum = sumOfDigit(num/10);
        return sum + num % 10;
    }

    static void sumOfDigit(int num, int sum){
        if(num ==0){
            System.out.println(sum);
            return;
        }
        sumOfDigit(num/10, sum+num%10);
        // Logic
        // Compute the sum of one digit
        // int singleDigit = num % 10;
        // sum = sum + singleDigit;
        // num = num/10;
        // sumOfDigit(num, sum);

    }
    // num = 123 
    // 1 + 2 + 3 = 6
    // static void sumOfDigit(int num, int sum){
    //     if(num ==0){
    //         System.out.println(sum);
    //         return;
    //     }
    //     // Logic
    //     // Compute the sum of one digit
    //     int singleDigit = num % 10;
    //     sum = sum + singleDigit;
    //     num = num/10;
    //     sumOfDigit(num, sum);

    // }
    public static void main(String[] args) {
       // sumOfDigit(123, 0);
       System.out.println(sumOfDigit(123));
    }
}
