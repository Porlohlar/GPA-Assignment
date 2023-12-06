import java.util.Scanner;
import java.util.ArrayList;


        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                methods.Methods.GPAcalculator gpaCalculator = new methods.Methods.GPAcalculator();

                // Allow the user to input course details
                System.out.println("Enter course details (name, code, unit, score) or type 'done' to finish:");

                while (true) {
                    System.out.print("Course Name: ");
                    String name = scanner.next();

                    if (name.equalsIgnoreCase("done")) {
                        break;
                    }

                    System.out.print("Course Code: ");
                    String code = scanner.next();

                    System.out.print("Course Unit: ");
                    int unit = scanner.nextInt();

                    System.out.print("Course Score: ");
                    int score = scanner.nextInt();

                    methods.Methods.Course course = new methods.Methods.Course(name, code, unit, score);
                    gpaCalculator.addCourse(course);
                }

                // Display the final result
                gpaCalculator.displayFinalResult();
            }
        }
