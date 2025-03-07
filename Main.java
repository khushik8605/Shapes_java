//Name : Khushi Kashyap
//Prn No. : 23070126060
//AIML A3
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
                    System.out.print("Enter radius of Circle: ");
                    Circle circle = new Circle(scan.nextDouble());
                    System.out.println("Area: " + circle.calculateArea());
                    System.out.println("Circumference: " + circle.calculatePerimeter());
                    break;
                    
                case 2:
                    System.out.print("Enter length of Rectangle: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter width of Rectangle: ");
                    double width = scan.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("Area: " + rectangle.calculateArea());
                    System.out.println("Perimeter: " + rectangle.calculatePerimeter());
                    break;
                    
                case 3:
                   
                case 4:
                  
                case 5:
                    System.out.print("Enter radius of Cylinder: ");
                    double r = scan.nextDouble();
                    System.out.print("Enter height of Cylinder: ");
                    double h = scan.nextDouble();
                    Cylinder cylinder = new Cylinder(r, h);
                    System.out.println("Surface Area: " + cylinder.calculateArea());
                    System.out.println("Volume: " + cylinder.calculateVolume());
                    break;
                   
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
        

