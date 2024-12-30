// SRP 
// public or default 
// default scope - with in the package
// public scope - within / outside
class Student {
    // Members of the class
    // Instance Members
    private int rollno;
    private String name;
    private int marks[] = new int[3];
    private boolean discount;
    private String email;
    private String phone;
    private String city;
    private String collegeName;

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    // init block
    {
        System.out.println("Init Block...");
        System.out.println(rollno + " " + name + " " + marks);
    }

    // Every class has a default constructor by default
    // Default Constructor (No Args)
    // class name and constructor name are same
    // constructor never return
    Student() {
        collegeName = "SRCC";
        // rollno = 1;
        // name = "";
        System.out.println("I am a Default Constructor");
    }

    Student(int rollno, String name) {
        this();
        this.rollno = rollno;
        this.name = name;
    }

    // Local Variables
    Student(int rollno, String name, int marks[]) {
        this(rollno, name);
        // Student();
        // this(); // calling default Constructor
        // this - keyword
        // current calling object reference
        // if (rollno <= 0) {
        // System.out.println("Invalid Rollno");
        // return;
        // }
        // this.rollno = rollno;
        // this.name = name;
        this.marks = marks;
        // Instance Var = Local Var
    }

    public void print() {
        System.out.println("Rollno " + rollno); // this.rollno
        System.out.println("Name " + name);
        System.out.println("Marks...");
        for (int mark : marks) {
            System.out.println(mark);
        }
        System.out.println("College Name " + collegeName);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    // void Student() {
    // System.out.println("I am a Method...");
    // }
}