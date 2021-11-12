import java.util.Scanner;

public class AscendingDigits
{
    public static void main(String[] args)
    {
        int rev=0;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num=sc.nextInt();

        while(num!=0)
        {
            int num1 =num % 10;
            rev= rev * 10 + num1;
            int div= num/10;
            num = div;

        }
        System.out.println("Number with reverse digit is "+rev);


    }
}
