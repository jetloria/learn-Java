import java.util.Scanner;

public class Operators {

    public static void main (String[] args){

        String item;
        int quantity;
        double price;
        double total;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What do you want to buy? ");
        item = scanner.nextLine();

        System.out.print("How many do you want to buy? ");
        quantity = scanner.nextInt();

        System.out.print("How much is the item? ");
        price = scanner.nextDouble();

        total = price * quantity;

        System.out.println("You have bought " +quantity+ " " +item+"/s");
        System.out.println("The total is: $" +total);

        scanner.close();

    }

}


//        System.out.print("Enter a number: ");
//        x = scanner.nextInt();
//
//        System.out.print("Enter another number: ");
//        y = scanner.nextInt();
//
//        z = x + y;
//        System.out.print("The sum is: "+z);