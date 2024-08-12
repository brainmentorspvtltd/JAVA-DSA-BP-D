public class Fact {
    static void fact(int num , int r){
        if(num == 1){
            System.out.println(r);
            return ;
        }
        // 5 * 4 * 3 * 2 * 1
        fact(num-1, num * r);
    }
    static int fact(int num){
        // Base case
        if(num == 1){
            return num;
        }
       int result  =  fact(num-1);
       return result * num;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        //fact(5, 1);
    }
}
