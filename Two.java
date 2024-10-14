public class Two {

    @Override
    public int hashCode(){
        return 1;
    }

    static int[] update(int a[]){
        int b[]= new int[a.length];
        for(int i = 0; i<a.length; i++){
            b[i] = a[i] * a[i];
            
        }
        return b; // reference
    }

    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50};
        double w[][] = new  double[3][3];
        Two two =new Two();
        System.out.println(two.toString());
        System.out.println(two.hashCode());
        System.out.println(w.toString());
        System.out.println(w.hashCode());
        int c []= update(arr);
        System.out.println(c);
        // for(var e : c){
        //     System.out.println(e);
        // }
    }
}
