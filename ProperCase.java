import java.util.Scanner;

public class ProperCase {
    public static void main(String[] args) {
        // raM kuMar shArmA
        // Ram Kumar Sharma
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Full Name");
        String fullName = scanner.nextLine();
        String names [] = fullName.split(" ");
        // Enhance for loop (Java 1.5)
        String fullFinalName = "";
        for(String name : names){
            char singleChar = name.charAt(0);
            String firstCharUpperCase = String.valueOf(singleChar).toUpperCase();
            String remString = name.substring(1).toLowerCase();
            String str = firstCharUpperCase + remString;
            fullFinalName = fullFinalName + str + " ";
        }
        System.out.println(fullFinalName);
        scanner.close();
    }
}
