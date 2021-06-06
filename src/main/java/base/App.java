package base;

/*

 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sahar Sheikholeslami

 */

/*
Exercise 13 - Determining Compound Interest
Simple interest is something you use only when making a quick guess.
Most investments use a compound interest formula, which will be much more accurate.
And this formula requires you to incorporate exponents into your programs.

Write a program to compute the value of an investment compounded over time.
The program should ask for the starting amount, the number of years to invest,
the interest rate, and the number of periods per year to compound.

The formula you’ll use for this is A = P(1 + r/n)^(n*t) where

P is the principal amount.
r is the annual rate of interest.
t is the number of years the amount is invested.
n is the number of times the interest is compounded per year.
A is the amount at the end of the investment.
Example Output
What is the principal amount? 1500
What is the rate? 4.3
What is the number of years? 6
What is the number of times the interest is compounded per year? 4
$1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.


Constraints
Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
Ensure that fractions of a cent are rounded up to the next penny.
Ensure that the output is formatted as money.


Challenges
Ensure that all of the inputs are numeric and that the program will not let the user proceed without valid inputs.
Create a version of the program that works in reverse, so you can determine the initial amount you’d need to invest to reach a specific goal.
Implement this program as a GUI app that automatically updates the values when any value changes.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {



            Scanner input = new Scanner(System.in);
            System.out.print("What is the principal amount? ");
            int principal = input.nextInt();
            System.out.print("What is the rate? ");
            double interest = input.nextDouble();
            System.out.print("What is the number of years? ");
            int yearNum = input.nextInt();
            System.out.print("What is the number of times the interest is compounded per year? ");
            int compoundedNum = input.nextInt();

            double investment = (double) (principal* Math.pow(1+(interest/100)/compoundedNum,(compoundedNum*yearNum)));






            String output = String.format("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f\n", principal,interest,yearNum,compoundedNum,investment );

            System.out.println(output);

    }
}

