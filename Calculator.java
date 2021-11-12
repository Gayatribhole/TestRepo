import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {

        while (true)
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Which operation do you want to perform?" + '\n' +
                    "1. Addition" + '\n' +
                    "2. Multoplication" + '\n' +
                    "3. Division" + '\n' +
                    "4. Subtraction");

            System.out.println("Enter Choice : ");
            int choice = sc.nextInt();

            System.out.println("Enter Number 1 : ");
            int num1 = sc.nextInt();

            System.out.println("Enter Number 2: ");
            int num2 = sc.nextInt();

            switch (choice)
            {
                case 1: //for Addition
                    int sum = num1 + num2;
                    System.out.println("Addition of " + num1 + " and " + num2 + " is = " + sum);
                    break;

                case 2: //for multiplication
                    int multi = num1 * num2;
                    System.out.println("Multiplication of " + num1 + " and " + num2 + " is = " + multi);
                    break;

                case 3: //for division
                    int div = num1 / num2;
                    System.out.println("Division of " + num1 + " and " + num2 + " is = " + div);
                    break;

                case 4: //for subtraction
                    int sub = num1 - num2;
                    System.out.println("Subtraction of " + num1 + " and " + num2 + " is = " + sub);
                    break;

                default:
                    System.out.println("Please choose valid option.");

            }

            System.out.println("Do you want to continue : y or n ?");
            String con = sc.next();

            if(con.equals("n"))
                System.exit(0);

        }

    }
}
