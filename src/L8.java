
import java.util.Scanner;
public class L8 {

  public static void main(String[] args) {
      Scanner read = new Scanner(System.in);


      /*   String name;
        int hours;
        double payRate;
        double grossPay;

        //Create a Scanner object to read input
        Scanner read = new Scanner(System.in);

        //Get the user's name
        System.out.println("What is your name?");
        name = read.nextLine();

        //Get the number of hours worked
        System.out.println("How many hours did you work?");
        hours = read.nextInt();

        //Get the user's hourly rate
        System.out.println("What is your hourly pay rate?");
        payRate = read.nextDouble();

        //Calculate the gross pay
        grossPay = hours * payRate;

        System.out.println("Hello " + name);
        System.out.println("Your gross pay is $" + grossPay);*/

        //bugaboo #1 - Hanging Carriage
      /*int age;
      String name;

      System.out.println("How old are you?");
      age = read.nextInt();

      read.nextLine();

      System.out.println("Whats ur name?");
      name = read.nextLine();

      System.out.println("Hello, " + name + ". You are " + age + " years old.");*/

      //bugaboo # 2 - Token

      String firstName;
      String lastName;

      System.out.println("Enter your full name(Both first and last. Press enter after putting ur first and last name.) ");
      firstName = read.next();
      lastName = read.next();

      System.out.println("Hello, " + firstName + " " + lastName);
    }
}
