public class ArmStrongNumber {
    static int countDigit(int num){
        // reach to the base case
        if(num ==0){
            return 0 ; // count 0 will be initalize
        }
        // Head Recursion
        int c= countDigit(num/10); // num /10 (Small Problem) + Recursion
        return  c + 1;
    }
    static void armStrong(int org, int sum, int aux, int count){
        // Base case
        if(aux == 0){
            System.out.println(org == sum?"Armstrong number":"Not Armstrong number");
            return ; 
        }
        // write code here
        // think about small problem
        int singleDigit = aux % 10;
        // cube (power)
        int cube = (int)Math.pow(singleDigit,count);
        sum = sum + cube;
        aux = aux / 10 ; // make number small
        armStrong(org, sum, aux, count); // Tail Recursion
    }
    public static void main(String[] args) {
        int num = 153;
        armStrong(num, 0, num, countDigit(num));

    }
}
