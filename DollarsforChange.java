
/**
 * CSCI 15-M01
 * Paula Wojcik
 * Dollars for Change
 * 2/10/2015
 */
import java.util.Scanner;

public class DollarsforChange
{
    private final double QUARTER=.25;
    private final double DIME=.10;
    private final double NICKEL=.05;
    private final double PENNY=.01;
    private final double DOLLAR=1.0;

    public DollarsforChange()
    {
        double number;

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a dollar amount: ");
        number=input.nextDouble();

        numOfChange(number);
    }

    public void numOfChange(double dollars)
    {
        int quarnum;
        int dimenum;
        int nickelnum;
        int pennynum;
        int dolnum;

        dolnum=(int)(dollars/DOLLAR);
        dollars%=DOLLAR;

        quarnum=(int)(dollars/QUARTER);
        dollars%=QUARTER;

        dimenum=(int)(dollars/DIME);
        dollars%=DIME;

        nickelnum= (int)(dollars/NICKEL);
        dollars%=NICKEL;

        pennynum=(int)(dollars/PENNY);

        System.out.println("Your change is: " + quarnum+" quarters, "+dimenum+" dimes, " +nickelnum+ " nickels, and "+pennynum+" pennies.");
    }
}
