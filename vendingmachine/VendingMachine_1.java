package vendingmachine;

import java.util.Scanner;

public class VendingMachine_1
{
    public static void main(String[] args) {
        double currentamt = 3000;
        int price;
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU : 1. PEPSI (RS. 35)   2. SPRITE (RS.25)  3. 7UP (RS. 30)");
        System.out.println("Choose item : ");
        int item_id = sc.nextInt();

        switch (item_id)
        {
            case 1:
                price = 30;
                System.out.println("PEPSI (RS. 35)");
                System.out.println("Enter amount : ");
                int amount = sc.nextInt();
                if (amount > price) {
                    int balance = amount - price;
                    System.out.println("Please collect balance amount of RS." + balance);

                    System.out.println("Despensing PEPSI");
                    double TotalAmt = currentamt + price;

                    System.out.println("Updated Amount in vending machine is Rs. " + TotalAmt);

                }
                else if (amount == price)
                {
                    int balance = amount;
                    System.out.println("Despensing PEPSI");
                    double TotalAmt = currentamt + price;
                    System.out.println("Updated balance is Rs. " + TotalAmt);
                }
                else
                {
                    System.out.println("Please enter right amount");
                }

                break;



            case 2:
                price = 25;
                System.out.println("SPRITE (RS. 25)");
                System.out.println("Enter amount : ");

                amount = sc.nextInt();
                if (amount > price) {
                    int balance = amount - price;
                    System.out.println("Please collect balance amount of RS." + balance);

                    System.out.println("Despensing SPRITE");
                    double TotalAmt = currentamt + price;

                    System.out.println("Updated Amount in vending machine is Rs. " + TotalAmt);

                }
                else if (amount == price)
                {
                    int balance = amount;
                    System.out.println("Despensing SPRITE");
                    double TotalAmt = currentamt + price;
                    System.out.println("Updated balance is Rs. " + TotalAmt);
                }
                else
                {
                    System.out.println("Please enter right amount");
                }
                break;

            case 3:
                price = 30;
                System.out.println("7UP (RS. 30)");
                System.out.println("Enter amount : ");
                amount = sc.nextInt();
                if (amount > price)
                {
                    int balance = amount - price;
                    System.out.println("Please collect balance amount of RS." + balance);

                    System.out.println("Despensing 7UP");
                    double TotalAmt = currentamt + price;

                    System.out.println("Updated Amount in vending machine is Rs. " + TotalAmt);

                }
                else if (amount == price)
                {
                    int balance = amount;
                    System.out.println("Despensing 7UP");
                    double TotalAmt = currentamt + price;
                    System.out.println("Updated balance is Rs. " + TotalAmt);
                }
                else
                {
                    System.out.println("Please enter right amount");
                }
                break;
        }
    }

}
