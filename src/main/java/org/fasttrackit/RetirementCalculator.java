package org.fasttrackit;

import exceptions.TooOldException;

import java.util.Scanner;

//ex6
public class RetirementCalculator {

    public static void calc() throws TooOldException {
        int currentYear=2019;
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your current age?");
        int age=sc.nextInt();

        if (age<64) {
            System.out.println("At what age would you like to retire?");
            int retireAge = sc.nextInt();
            int yearsLeft = retireAge - age;
            int yearOfRetirement = yearsLeft + currentYear;
            System.out.println("You have " + yearsLeft + " years left until you can retire.\nIt is " + currentYear + "." +
                    "You will retire in " + yearOfRetirement);
        }else if (age>64){
            throw new TooOldException("You are too old to work !Please go home.");
        }
        }

    public static void main(String[] args){
        try {
            calc();
        } catch (TooOldException e) {
            System.out.println(e);
        }
    }
}
