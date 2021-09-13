/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        double weight, height, bmi;
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter weight: ");
        weight = keyboardInput.nextDouble();

        System.out.print("Enter height: ");
        height = keyboardInput.nextDouble();

        bmi = (weight /(height * height))*703;
        System.out.println("Your bmi is " + String. format("%.2f" , bmi ));

        if(bmi < 18.5){
            System.out.print("You are underweight. You should see your doctor.");
        }
        else if(bmi > 25){
            System.out.print("You are overweight. You should see your doctor.");
        }
        else{
            System.out.print("You are within the ideal weight range. ");
        }

        

    }
}
