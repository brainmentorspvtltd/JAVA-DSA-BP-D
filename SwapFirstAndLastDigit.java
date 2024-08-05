public class SwapFirstAndLastDigit {
    public static void main(String[] args) {
        int num = 1234;
        int lastDigit = num % 10;
        // For First Digit , Count the number of digit
        int count = 0;
        int copy = num;
        while(copy!=0){
        copy = copy / 10; // make the number small
        count++;
    }
    int pow = (int)Math.pow(10,count-1);
    System.out.println(pow);
    int first = num / pow;
    int mid = num % pow;
    mid = mid / 10; // remove last digit
    int result = lastDigit * pow + mid * 10 + first;
    System.out.println(result);
    }   
}
