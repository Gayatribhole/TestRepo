package vendingmachine;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class VendingMachine_1
{
    Scanner sc = new Scanner(System.in);
    public static int currentamt=3000;


    public int Display()
    {
        System.out.println("****************************    MENU    ******************************");
        System.out.println("1. PEPSI (RS. 35)\n2. SPRITE (RS.25)\n3. 7UP (RS. 30)\n4. Amount Available\n5. Transaction History"  );
        System.out.println("**********************************************************************");
        System.out.println("Choose item : ");
        int item_id = sc.nextInt();
        return item_id;
    }

    public void ChooseProduct(int item_id)
    {
        int choice=item_id;
        if(choice==1)
            System.out.println("Your PEPSI is ready to dispatch .\nPlease pay Rs. 35 : ");

        if(choice==2)
            System.out.println("Your SPRITE is ready to dispatch .\nPlease pay Rs. 25 : ");

        if(choice==3)
            System.out.println("Your 7UP is ready to dispatch .\nPlease pay Rs. 30 : ");

        if(choice==4)
            System.out.println("You asked for total amount available in machine.\nPlease wait : ");

        if(choice > 5)
            System.out.println("Please enter correct product");

    }

    public  int Payment(int ProductPrice) {
        int price = ProductPrice;
        int payedAmount;
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Pay amount : ");
        payedAmount = sc.nextInt();
        return payedAmount;
    }

    public int ReturnInfo(int PayedAmount, int price)
    {
        int payedAmount = PayedAmount;
        int returnableAmount=0;
           if (payedAmount > price) {
                returnableAmount = payedAmount - price;
                System.out.println("Please collect balance amount of RS." + returnableAmount);

                System.out.println("Despensing Item");
            }
           else if (payedAmount == price)
           {
                int balance = payedAmount;
                System.out.println("Despensing Item");
            }
           else
           {
               System.out.println("Please enter right amount");
           }
           return returnableAmount;


    }

     String IsContinue()
    {
        System.out.println("----------------------------------------------------------------------");
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
        int price;

        HashMap<Integer , HashMap<String,String>> ListOfTransactions =new HashMap<Integer , HashMap<String,String>>(); /* To store
        total transaction history.As a database.*/
        int numberOfTransactions = 1;

        while(true)
        {
            HashMap<String , String> localTransaction =new HashMap<String,String>();  /*To store current transation information*/
            int PayedAmount=0;
            int ReturnableAmount=0;
            int item_id = vm.Display();
            vm.ChooseProduct(item_id);
            if(item_id==1)
            {
                price = 35;
              PayedAmount =  vm.Payment(price);
              ReturnableAmount = vm.ReturnInfo(PayedAmount,price);
               currentamt = currentamt+PayedAmount;
            }
            else if(item_id==2)
            {
                price = 25;
                PayedAmount =  vm.Payment(price);
                ReturnableAmount = vm.ReturnInfo(PayedAmount,price);
                currentamt = currentamt+PayedAmount;
            }
            if(item_id==3)
            {
                price = 30;
                PayedAmount =  vm.Payment(price);
                ReturnableAmount = vm.ReturnInfo(PayedAmount,price);
                currentamt = currentamt+PayedAmount;
            }
            if(item_id==4)
            {
                price=0;
                currentamt = currentamt + price;
                System.out.println("Total available balance is " + currentamt);
            }
            if (item_id==5)
            {
                System.out.println("**********************************************************************");
                for(Integer key:ListOfTransactions.keySet())
                {
                    HashMap<String , String> temp = new HashMap<String,String>();
                    temp = ListOfTransactions.get(key);
                    System.out.println("Transaction Number : "+key + "\nTransaction Time : "+temp.get("timestamp")+ "\nItem_id : "
                            +temp.get("item_id")+"\nAmount Payed by User :"+temp.get("PayedAmount")+"\nReturned Amount : "
                            +temp.get("ReturnableAmount")+"\nTotal Amount of Vending Machine : "+temp.get("currentamt"));
                    System.out.println("----------------------------------------------------------------------");
                }
                System.out.println("**********************************************************************");
            }

            Timestamp timestamp=new Timestamp(System.currentTimeMillis()) ;  //to get time and date of transaction.
            localTransaction.put("timestamp",String.valueOf(timestamp));
            localTransaction.put("item_id",String.valueOf(item_id));
            localTransaction.put("PayedAmount",String.valueOf(PayedAmount));
            localTransaction.put("ReturnableAmount",String.valueOf(ReturnableAmount));
            localTransaction.put("currentamt",String.valueOf(currentamt));

            ListOfTransactions.put(numberOfTransactions,localTransaction);
            numberOfTransactions = numberOfTransactions+1;

            String decision = vm.IsContinue();
            if(decision.equals("n")||decision.equals("N"))
            {
                break;
            }
        }

    }

}
