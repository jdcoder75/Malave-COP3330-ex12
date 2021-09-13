package org.example;
import java.util.Scanner;
import java.util.Date;
/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Jose Malave
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);

        System.out.println( "Enter the principal:" );
        String principleIn= sc.nextLine();

        System.out.println( "Enter the rate of interest:" );
        String interestIn = sc.nextLine();

        System.out.println( "Enter the number of years:" );
        String yearsIn = sc.nextLine();

        double P = Double.parseDouble(principleIn);
        double r = Double.parseDouble(interestIn);
        double t = Double.parseDouble(yearsIn);

        double US_Dollars= (double)Math.round(P * (1 + ((r/100) * t)));

        System.out.println(" After " + yearsIn + " years at " + interestIn + "%, the investment will be worth $" + US_Dollars);
    }
}
