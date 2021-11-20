package oppsAssignments;

import opps.Addnum;

public class AddandConcat
{

    public void Add(int a, int b)
    {
        int c=0;
        c=a+b;
        System.out.println("Addtion of "+a+ " and " +b+ " is "+c);
    }

    public void Add(String s, String y) {
        String concat=  s + y;
        // String addition = s.concat(y);
        System.out.println("new string is : "+ concat);
    }

    public static void main(String[] args) {
        Addnum an = new Addnum();
        int a = 20;
        int b = 30;
        String s1 = " Hello";
        String s2 = " World";
        an.Add(a, b);
        an.Add(s1, s2);

    }
}
