package oppsAssignments;

public abstract class Banks
{
    public abstract void displayDenominations()
    {
        system.out.println("Denominations available in banks are displayed below: ");
    }
    

    public static void main(String[] args)
    {
        Banks canaraBank = new CanaraBank();
        canaraBank.displayDenominations();

        Banks bom = new BankOfMaharashtra();
        bom.displayDenominations();

        Banks icici = new ICICIBank();
        icici.displayDenominations();
    }
}

