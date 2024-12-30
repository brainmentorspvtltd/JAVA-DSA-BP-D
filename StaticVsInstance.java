import static java.lang.System.out;

class User {
    String userid;
    String password;
    static int count; // 0

    User(String userid, String password) {
        this.userid = userid;
        this.password = password;
        count++;
        out.println("Count " + count);
    }
}

class B {
    static class A {
        static void show() {

            System.out.println("A Show....");
        }

        void disp() {
            show();
            System.out.println("Disp ");
        }
    }
}

class TriMath {
    private TriMath() {
    }

    static void sin() {
        out.println("Sin");
    }

    static void cos() {
        System.out.println("COs");
    }
}

class Customer {
    // Instance Member (Bind with Object)
    int id;
    String name;
    // Class Member (Bind with Class)
    static String companyName;
    static {
        System.out.println("Static Block Call ");
        companyName = "Brain Mentors";
    }
    static {
        System.out.println("Another Static Block");
    }
    // Customer(){

    // }
    Customer(int id, String name) {
        System.out.println("Cons Call ");
        this.id = id;
        this.name = name;
    }
}

public class StaticVsInstance {
    public static void main(String[] args) {
        B.A.show();
        B.A obj = new B.A();
        obj.disp();
        // Math.max(10, 20);
        // TriMath m = new TriMath();
        // m.sin();
        // m.cos();
        TriMath.sin();
        TriMath.cos();
        // User user = new User("Amit", "1111");
        // User user2 = new User("Tim", "2111");
        // User user3 = new User("Vim", "3111");
        // System.out.println(Customer.companyName);
        // Customer ram = new Customer(1001, "Ram");

        // // System.out.println(ram.companyName);
        // System.out.println(ram.id);
        // System.out.println(ram.name);
        // Customer shyam = new Customer(1002, "Shyam");
        // System.out.println(Customer.companyName);
        // System.out.println(shyam.id);
        // System.out.println(shyam.name);
    }
}
