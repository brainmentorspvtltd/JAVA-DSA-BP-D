import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id ");
        int id = scanner.nextInt();
        System.out.println("Enter the Name");
        scanner.nextLine(); // eat \n
        String name = scanner.nextLine();
        
        System.out.println("Name "+name+" Id "+id);
        
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the City");
        String city = scanner2.next();
        System.out.println("City "+city);
        scanner2.close();
        scanner.close();
    }
}
