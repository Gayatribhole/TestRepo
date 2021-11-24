package oppsAssignments;

public class LargNum
{
    public void LargestNumber(int num1, int num2)
    {
        if(num1>num2)
            System.out.println(" Largest number between " +num1 +" & " +num2 +" is" +num1);
        else
            System.out.println(" Largest number between " +num1 +" & " +num2 +" is" +num2);

    }

    public static void main(String[] args) {
        int a=4;
        int b=6;
        LargNum ln= new LargNum();
        ln.LargestNumber(a,b);

    }

}


public class LargNum1 extends LargNum
{
    public void LargestNumber(int num1,int num2,int num3)
    {
        int x=num1;

        if (num2 > x)
            x=num2;

        if (num3 > x)
            x=num3;

        System.out.println("Largest number between "+num1+","+num2+","+num3+" is "+x);
    }
    public static void main(String[] args) 
    {
        int a=5;
        int b=6;
        int c=7;
        
        LargNum1 ln1= new LargNum1();
        ln1.LargestNumber(a,b,c);
     }
 }
