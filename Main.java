//Name : Aneeka Jain
//Prn No. : 23070126013
//AIML A1
// Main.java
import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nChoose a shape to calculate:");
            System.out.println(
                    "1. Circle\n2. Rectangle\n3. Square\n4. Sphere\n5. Cylinder\n6. Square Base Pyramid\n0. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    
                case 2:
                    
                case 3:
                   
                case 4:
                  
                case 5:
                   
                case 6:
                   
                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);

        scan.close();
    }
}
        

