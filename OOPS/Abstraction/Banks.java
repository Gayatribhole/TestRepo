package oppsAssignments;

public abstract class Banks
{
    public abstract void displayDenominations();

    public static void main(String[] args)
    {
        Banks canaraBank = new CanaraBank();
        canaraBank.displayDenominations();

        Banks bof = new BankOfMaharashtra();
        bof.displayDenominations();

        Banks icici = new ICICIBank();
        icici.displayDenominations();
    }
}

