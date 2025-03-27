import java.util.Scanner;

public class userInput {
    public static void main(String[] args){

        double width = 0;
        double height = 0;
        double area = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is " +area+ " cm²");

        scanner.close();

    }
}



//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("What is your GPA: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " +name);
//        System.out.println("You are " +age+ " years old");
//        System.out.println("Your GPA is: " +gpa);
//        System.out.println("Student: " +isStudent);
//
//        if (isStudent){
//            System.out.println("You are enrolled as Student");
//        }
//        else {
//            System.out.println("You are not enrolled");
//        }

//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Enter your favorite color: ");
//        String color = scanner.nextLine();
//
//        System.out.println("You are " +age+ " years old");
//        System.out.println("You like color " +color);
//
//        scanner.close();