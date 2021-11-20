package vendingmachine;

import java.util.HashMap;
import java.util.Scanner;

public class VendingMachine_1
{
    Scanner sc = new Scanner(System.in);
    int currentamt=3000;

    public int Display()
    {

        System.out.println("MENU : 1. PEPSI (RS. 35)   2. SPRITE (RS.25)  3. 7UP (RS. 30) 4. Amount Available"  );
        System.out.println("Choose item : ");
        int item_id = sc.nextInt();
        return item_id;
    }

    public void ChooseProduct(int item_id)
    {
        int choice=item_id;
        if(choice==1)
            System.out.println("Your PEPSI is ready to dispatch . Please pay Rs. 35 : ");

        if(choice==2)
            System.out.println("Your SPRITE is ready to dispatch . Please pay Rs. 25 : ");

        if(choice==3)
            System.out.println("Your 7UP is ready to dispatch . Please pay Rs. 30 : ");

        if(choice==4)
            System.out.println("You asked for total amount available in machine. Please wait : ");

        if(choice > 4)
            System.out.println("Please enter correct product");

    }

    public void Payment(int item_id) {
        int choice = item_id;
        int price;
        int payedAmount;
        int returnableAmount;

        if (choice == 1) {
            price = 35;
            System.out.println("Pay amount : ");
            payedAmount = sc.nextInt();
            if (payedAmount > price) {
                returnableAmount = payedAmount - price;
                System.out.println("Please collect balance amount of RS." + returnableAmount);

                System.out.println("Despensing PEPSI");
                currentamt = currentamt + price;

                System.out.println("Updated Amount in vending machine is Rs. " + currentamt);

            } else if (payedAmount == price) {
                int balance = payedAmount;
                System.out.println("Despensing PEPSI");
                currentamt = currentamt + price;
                System.out.println("Updated balance is Rs. " + currentamt);
            } else
                System.out.println("Please enter right amount");
        }

        if (choice == 2) {
            price = 25;
            System.out.println("Pay amount : ");
            payedAmount = sc.nextInt();
            if (payedAmount > price) {
                returnableAmount = payedAmount - price;
                System.out.println("Please collect balance amount of RS." + returnableAmount);

                System.out.println("Despensing SPRITE");
                currentamt = currentamt + price;

                System.out.println("Updated Amount in vending machine is Rs. " + currentamt);

            } else if (payedAmount == price) {
                int balance = payedAmount;
                System.out.println("Despensing PEPSI");
                currentamt = currentamt + price;
                System.out.println("Updated balance is Rs. " + currentamt);
            } else
                System.out.println("Please enter right amount");
        }

        if (choice == 3) {
            price = 30;
            System.out.println("Enter amount : ");
            payedAmount = sc.nextInt();
            if (payedAmount > price) {
                returnableAmount = payedAmount - price;
                System.out.println("Please collect balance amount of RS." + returnableAmount);

                System.out.println("Despensing PEPSI");
                currentamt = currentamt + price;

                System.out.println("Updated Amount in vending machine is Rs. " + currentamt);

            }
            else if (payedAmount == price)
            {
                int balance = payedAmount;
                System.out.println("Despensing PEPSI");
                currentamt = currentamt + price;
                System.out.println("Updated balance is Rs. " + currentamt);
            }
            else
                System.out.println("Please enter right amount");
            }

        if (choice == 4)
            System.out.println("Amount available is : " + currentamt);

    }

     String IsContinue()
    {
        System.out.println("Do you want to Buy another product ? ");
        System.out.println(" Yes (y/Y)  No(n/N)");
        String decision = sc.next();
        if (decision.equals("y") || decision.equals("Y"))
            return "y";
        else
            return "n";

    }

    public static void main(String[] args)
    {
        VendingMachine_1 vm= new VendingMachine_1();
        /*while(1==1)
        {
            int item_id = vm.Display();
            vm.ChooseProduct(item_id);
            vm.Payment(item_id);
            String decision = vm.IsContinue();
            if(decision=="n")

        }
        */
        while(true){
            System.out.println("infinitive while loop");
            int item_id = vm.Display();
            vm.ChooseProduct(item_id);
            vm.Payment(item_id);
            String decision = vm.IsContinue();
            if(decision.equals("n")||decision.equals("N"))
            {
                break;
            }
        }

    }

}
