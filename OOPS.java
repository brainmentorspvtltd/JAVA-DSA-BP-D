// Class - BluePrint / Template / Plan / Structure
class Employee{
    // Members 
    int id;
    String name;
    double salary;

    static{
        System.out.println("run when class is load");
    }
    {
        System.out.println("Init Block.....");
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
    {
        System.out.println("Init Block 2");
    }
    Employee(){
        System.out.println("I am a default ");
    }
}
class Node{
    int data;
    Node next;
}
public class OOPS {
    public static void main(String[] args) {
        int m = 0;
       // System.out.println(m);
        //System.out.println("Hello OOPS");
        Employee emp = new Employee();
        // System.out.println(emp.id);
        // System.out.println(emp.name);
        // System.out.println(emp.salary);
    }
}
