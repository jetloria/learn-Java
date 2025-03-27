public class Main {
    public static void main(String[] args){

        //THIS IS MY FIRST JAVA PROGRAM

//        System.out.println("I like pizza");
//        System.out.println("I ike pizza its really good!");
//        System.out.println("Buy me pizza");

        int age = 30;
        int year = 2025;
        double price = 19.5;
        double gpa = 3.5;
        char grade = 'A';
        boolean isStudent = false;
        boolean forSale = false;

        System.out.println(age);
        System.out.println(year);
        System.out.println("The year is " +year);
        System.out.println("$"+price);
        System.out.println(gpa);

        if (isStudent){
            System.out.println("You are a Student");
        }
        else {
            System.out.println("You are not a Student");
        }

        String name = "Jethro Loria";
        System.out.println("Hello "+name);

        if (forSale){
            System.out.println("Yes the car is for sale");
        }
        else {
            System.out.println("The car is not for sale");
        }

    }
}
