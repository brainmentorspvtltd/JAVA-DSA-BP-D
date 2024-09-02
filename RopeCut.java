public class RopeCut {
    static int numberOfPiece(int ropeLen , int a, int b , int c){
        if(ropeLen==0){
            return 0;
        }
        if(ropeLen<0){
            return -1;
        }
        int option1 = numberOfPiece(ropeLen-a, a, b, c);
        int option2 = numberOfPiece(ropeLen-b, a, b, c);
        int option3 = numberOfPiece(ropeLen-c, a, b, c);
        int result = Math.max(option3, Math.max(option1, option2));
        if(result == -1){
            return -1;
        }
        return result +1;
    }
    public static void main(String[] args) {
        System.out.println(numberOfPiece(5, 5,2, 1));
    }
}
