class H extends FinalvsStatic {
    // void disp(){

    // }
}

class B {
    int x;
}

// final - prevent varaiable to modify
// final - prevent class inheritance
// final - prevent method overriding
// final class can't be inherit
// public final class FinalvsStatic {
public class FinalvsStatic {
    static int t; // class member
    final int J;
    final static int M = 90;

    FinalvsStatic() {
        J = 10;
    }

    final void disp() {

    }

    static void show(final int Y) {
        // Y++;
    }

    public static void main(String[] args) {
        System.out.println(FinalvsStatic.M);
        final int MAX = 100; // Local var
        final int MIN_CAP = 1;
        final int arr[] = { 10, 20 };
        arr[0]++;
        // arr = new int[10];
        // MAX++;
        final B b = new B();
        // b = new B();
        b.x++;
        B bb = new B();
    }
}
