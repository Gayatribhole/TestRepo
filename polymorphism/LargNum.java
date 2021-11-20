package oppsAssignments;

import java.util.Scanner;

public class LargNum
{
    public void LargestNumber(int num1, int num2)
    {
        if(num1>num2)
            System.out.println(" Largest number between " +num1 +" & " +num2 +" is" +num1);
        else
            System.out.println(" Largest number between " +num1 +" & " +num2 +" is" +num2);

    }

    public void LargestNumber(int num1,int num2,int num3)
    {
        int x=num1;

        if (num2 > x)
            x=num2;

        if (num3 > x)
            x=num3;

        System.out.println("Largest number between "+num1+","+num2+","+num3+" is "+x);
    }


    public static void main(String[] args) {
        int a=4;
        int b=6;
        int c=7;
        LargNum ln= new LargNum();
        ln.LargestNumber(a,b);
        ln.LargestNumber(a,b,c);

    }

}
