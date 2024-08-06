public class NestedLoops {
    public static void main(String[] args) {
        outer:
        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=3; j++){
                if(i==j){
                    continue outer;
                    //break;
                }
                System.out.println("I is "+i+" J is "+j);
            }
        }
    }
}
