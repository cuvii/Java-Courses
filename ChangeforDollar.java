
/**
 * CSCI 125-M01
 * Paula Wojcik
 * 2/5/2015
 * Change for a Dollar
* Simple code that adds up values entered by the user.
 */

import java.util.Scanner;

public class ChangeforDollar
{
    private final double QUARTER=.25;
    private final double DIME=.10;
    private final double NICKEL=.05;
    private final double PENNY=.01;
    private  final double DOLLAR=1.0;

    public static void main(String[]args)
    {
        final double QUARTER=.25;
        final double DIME=.10;
        final double NICKEL=.05;
        final double PENNY=.01;
        final double DOLLAR=1.0;

        ChangeforDollar check= new ChangeforDollar();

        double quarnum;
        double dimenum;
        double nickelnum;
        double pennynum;

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the # of quarters: ");
        quarnum=input.nextDouble();

       
        System.out.println("Please enter the # of dimes: ");
        dimenum=input.nextDouble();

       
        System.out.println("Please enter the # of nickles: ");
        nickelnum=input.nextDouble();

       
        System.out.println("Please enter the # of pennies: ");
        pennynum=input.nextDouble();

        check.doubleCheck(quarnum,dimenum,nickelnum,pennynum);

    }
    public void doubleCheck(double quarnum, double dimenum, double nickelnum, double pennynum)
    {
        double curCount=0;

        curCount+=quarnum*QUARTER;
        curCount+=dimenum*DIME;
        curCount+=nickelnum*NICKEL;
        curCount+=pennynum*PENNY;

        if(curCount>=DOLLAR)
            System.out.println(quarnum+" quarters, "+dimenum+" dimes, "+nickelnum+" nickels," + pennynum + " pennies make a Dollar.");
        else
            System.out.println(quarnum+" quarters, "+dimenum+" dimes, "+nickelnum+" nickels," + pennynum + " pennies do not make a Dollar.");
    }

}
