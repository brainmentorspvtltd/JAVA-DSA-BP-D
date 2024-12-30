import java.util.ArrayList;

class Emp {
    String name;
    long id;

    public Emp(String name, long id) {
        this.name = name;
        this.id = id;
    }

}

public class TestVM {
    public static void main(String[] args) {
        long id = 1;
        ArrayList<Emp> empList = new ArrayList<>();
        System.out.println("Heap Fill Soon...");
        while (true) {
            Emp emp = new Emp("Ram" + id, id);
            empList.add(emp);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            id++;
        }
    }
}
