/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;
import java.lang.Math;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weight = scan.nextDouble();

        System.out.print("Enter your height in inches: ");
        double height = scan.nextDouble();

        double bmi = (weight / (height * height)) * 703;
        double bmi2 = Math.round(bmi * 10.0) / 10.0;

        if(bmi < 18.5)
        {
            System.out.println("Your BMI is " + bmi2 + "\n" + "You are underweight.");
        }
        else if (bmi > 18.5 && bmi < 25)
        {
            System.out.println("Your BMI is " + bmi2 + "\n" + "You are within the ideal weight range.");
        }
        else if(bmi > 25)
        {
            System.out.println("Your BMI is " + bmi2 + "\n" + "You are overweight.");
        }
    }
}
