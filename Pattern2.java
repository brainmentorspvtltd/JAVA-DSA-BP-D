public class Pattern2 {
    public static void main(String[] args) {
        final int N = 5;
        for(int row = 1; row<=N ; row++){
            // space
            for(int space = 1; space<=N-row; space++){
                System.out.print(" ");
            }
            // star
            for(int star = 1; star<=row; star++){
                System.out.print("* ");
            }
            // new line 
            System.out.println();
        }
    }
}
