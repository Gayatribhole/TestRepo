import java.util.Arrays;
import java.util.Scanner;

public class AscendingDigits
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number : ");

        String numstr = sc.next();
        if(numstr.matches("^\\d+\\d+"))  //Checking entered  number is integer or not.

        {
            char[] numarry = numstr.toCharArray();

            Arrays.sort(numarry);

            String Ascnum = String.valueOf(numarry);

            System.out.println(" original number is " + numstr );
            System.out.println("Sorted with Ascending order of digit is " + Ascnum);
        }
        else
            System.out.println("Input is not  an Integer number");


    }
}
