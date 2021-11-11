import java.util.Scanner;

public class LowUpChar
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter alpabet: ");
        char ch = s.next().charAt(0);

        if(ch>='a' && ch<='z')
        {
            System.out.println(" Alphabet "+ch+" is Lowercase.");
        }

        else if (ch>='A' && ch<='Z')
        {
            System.out.println("Alphabet "+ch+" is Uppercase.");
        }

        else
        {

            System.out.println("Invalid input");
        }


    }
}
