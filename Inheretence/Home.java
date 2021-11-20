package oppsAssignments;

public class Home
{
    static int numberOfLights;
    static String roomName;
    static void noOfLights(String roomName, int a)
    {
        System.out.println("Number of lights in the "+roomName+" is : " +a);
    }

    public static void main(String[] args)
    {
        Home home=new Home();
        String roomName="Home";
        numberOfLights=10;
        home.noOfLights(roomName,numberOfLights);
    }

}
