//********************************************************************
//
//  Author:       Afaq Ahmad
//
//  Program #:    4
//
//  File Name:    Program4.java
//
//  Course:       ITSE 2321 Object-Oriented Programming
//
//  Due Date:     September 29th
//
//  Instructor:   Prof. Fred Kumi
//
//  Chapter:      Chapter 4: Control Statements Part 1
//
//  Description:  This program computes the weekly gross pay, net pay,
////              and overtime pay for employees at Annan Supermarket.
////              Overtime hours (over 40) are paid at 1.5 times the
////              regular hourly rate. Net pay is gross pay minus
////              deductions, which include income tax (12.75% if gross
////              pay exceeds $750) and a $35 parking charge.
//
//********************************************************************

import java.util.Scanner;

public class Program4
{
    //***************************************************************
    //
    //  Method:       main
    //
    //  Description:  The main method of the program
    //
    //  Parameters:   String array
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public static void main(String[] args)
    {
        // Declare more variables here
        int idNumber;            // Employee ID Number
        double hourlyRate;          // Hourly rate of pay
        double hoursWorked;      // Total hours worked in the week
        double regularHours;     // Regular hours worked (up to 40)
        double overtimeHours;    // Overtime hours worked (over 40)
        double regularPay;       // Pay for regular hours
        double overtimePay;      // Pay for overtime hours
        double grossPay;         // Total gross pay
        double tax = 0.0;        // Income tax deduction
        double deductions;       // Total deductions
        double netPay;           // Net pay after deductions

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        developerInfo();

        // Prompt user for inputs
        System.out.print("ID Number: ");
        idNumber = input.nextInt();

        System.out.print("Hourly Rate: ");
        hourlyRate = input.nextDouble();

        System.out.print("Hours worked: ");
        hoursWorked = input.nextDouble();

        // Initialize regular and overtime hours
        regularHours = hoursWorked;
        overtimeHours = 0.0;

        //Calculate overtime hours if any
        if (hoursWorked > 40)   {
            overtimeHours = hoursWorked - 40;
            regularHours = 40;
        }

        // Calculate pay amounts
        regularPay = regularHours * hourlyRate; // Regular pay
        overtimePay = overtimeHours * hourlyRate * 1.5; // 1.5 times the regular rate
        grossPay = regularPay + overtimePay; // Total gross pay

        //Calculate tax if gross pay exceeds $750
        if (grossPay > 750) {
            tax = grossPay * 0.1275; // 12.75% tax
        }

        // Calculate total deductions and net pay
        deductions = tax + 35.00; // $35 parking charge
        netPay = grossPay - deductions; // Net pay after deductions

        // Display results
        System.out.println("\nProgram 4");
        System.out.printf("  ID Number:        %d%n", idNumber); // %d for integer  %n for new line
        System.out.printf("  Pay Rate:         $%.2f%n", hourlyRate); // %f for float %.2f for 2 decimal places
        System.out.printf("  Regular Hours:    %.2f%n", regularHours); // %f for float %.2f for 2 decimal places
        System.out.printf("  Overtime Hours:   %.2f%n", overtimeHours); // %f for float %.2f for 2 decimal places
        System.out.printf("  Total Hours:      %.2f%n", hoursWorked); // %f for float %.2f for 2 decimal places
        System.out.printf("  Regular Pay:      $%.2f%n", regularPay); // %f for float %.2f for 2 decimal places
        System.out.printf("  Overtime Pay:     $%.2f%n", overtimePay); // %f for float %.2f for 2 decimal places
        System.out.printf("  Gross Pay:        $%.2f%n", grossPay); // %f for float %.2f for 2 decimal places
        System.out.printf("  Tax:              $%.2f%n", tax); // %f for float %.2f for 2 decimal places
        System.out.printf("  Deductions:       $%.2f%n", deductions); // %f for float %.2f for 2 decimal places
        System.out.printf("  Net Pay:          $%.2f%n", netPay); // %f for float %.2f for 2 decimal places

    } // End of the main method

    //***************************************************************
    //
    //  Method:       developerInfo
    //
    //  Description:  The developer information method of the program
    //
    //  Parameters:   None
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public static void developerInfo()
    {
        System.out.println("Name:     Afaq Ahmad");
        System.out.println("Course:   ITSE 2321 Object-Oriented Programming");
        System.out.println("Program:  Four");
        System.out.println("Due Date: September 29th\n");
    } // End of the developerInfo method
}