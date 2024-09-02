public class Dice {
    static int countReachToN(int start , int end, String result){
        if(start==end){
            System.out.print(result+" ");
            return 1;
        }
        if(start>end){
            return 0;
        }
        int count = 0;
        for(int dice = 1; dice<=6; dice++){
            count = count + countReachToN(start+dice, end, result  + dice);
        }
    //     int count = 0;
    //     count = count + countReachToN(start + 1, end);
    //     count = count + countReachToN(start + 2, end);
    //     count = count + countReachToN(start + 3, end);
    //     count = count + countReachToN(start + 4, end);
    //     count = count + countReachToN(start + 5, end);
    //     count = count + countReachToN(start + 6, end);

        return count;
    }
    public static void main(String[] args) {
       System.out.println(countReachToN(0, 100,""));
    }
}
