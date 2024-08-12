public class CountEvenOddInRange {
    static void countEO(int range , int result[]){
        // Base case
        if(range == 0){
            System.out.println("Even "+result[0]);
            System.out.println("Odd "+result[1]);
            return ;
        }
        // result[0] = Even Count
        // result[1] = odd count
        // Even?
        if(range % 2 ==0){
           result[0]++;
            // result[0] = result[0] + 1;
        }
        else{
            result[1] = result[1]+1;
        }
        countEO(range-1, result);
    }
     static int[] countEO(int range){
        if(range == 0){
            int count[] = new int[2]; // {0,0}
            return count;
        }
        int result[] =countEO(range-1);
        if(range % 2==0){
            result[0]++;
        }
        else{
            result[1]++;
        }
        return result;
     }
    public static void main(String[] args) {
        // int e[] = {0,0};
        int count[] = new int[2];
        //int count[] = new int[2]; // {0,0}
        countEO(5, count);
    }
}
