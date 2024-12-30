public class TestStudent {
    public static void main(String[] args) {
        int x;
        x = 10;
        Student ram;
        // ram is a reference variable
        // ram = new Student();
        ram = new Student(1001, "Ram", new int[] { 90, 88, 77 });
        ram.print();
        ram.setEmail("ram@yahoo.com");
        System.out.println(ram.getEmail());
        // ram.rollno = -1001;
        // ram.name = "@#";
        // ram.marks = new int[] {-100,-90,-80};
        // ram.Student();
        // Student() or System.out.println() - Calling
        // new - keyword (Runtime Memory Allocation)
        // System.out.println(ram.rollno);
        // System.out.println(ram.name);
        // System.out.println(ram.marks);
    }
}
