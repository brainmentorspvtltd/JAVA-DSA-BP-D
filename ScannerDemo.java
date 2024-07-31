import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//import java.lang.* ; // default (System, String etc)

public class ScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner; // reference type
        // new Scanner(); // object create Scanner
        // Scanner - act as a Buffer
        int count = 0;
       // scanner  = new Scanner("Hello How are You");
       scanner = new Scanner(new File("/Users/amitsrivastava/Documents/java-dsa-bpit/ScannerDemo.java")) ;
       //while(scanner.hasNext()){ 
        while(scanner.hasNextLine()){
            scanner.nextLine();
            count++;
            //System.out.println(scanner.next());
        }
        System.out.println(count);
        scanner.close();
        int a =10; // value type

    }
}
