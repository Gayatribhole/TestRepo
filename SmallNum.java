import java.util.Scanner;

public class SmallNum
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a= s.nextInt();

        System.out.println("Enter second number : ");
        int b= s.nextInt();

        System.out.println("Enter third number : ");
        int c= s.nextInt();

        System.out.println("Enter fourth number : ");
        int d= s.nextInt();

        int x=a; //Passed value of a to x variable as reference copy
                 //Hence x= value of a

        if (b<x) //Compared b with x if condition satisfied put value of b in x
            x=b;

        if (c<x) //Compared c with x if condition satisfied put value of c in x
            x=c;

        if (d<x) //Compared d with x if condition satisfied put value of d in x
            x=d;

        System.out.println("Smallest number between "+a+","+b+","+c+","+d+" is "+x);
    }
}
