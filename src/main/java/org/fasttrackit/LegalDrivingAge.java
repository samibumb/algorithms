package org.fasttrackit;

import java.util.Scanner;

public class LegalDrivingAge {

    public static void toDrive() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input age :");
        int age=scanner.nextInt();
        if (age<18){
            throw new Exception("You cannot drive.You are just a kid");
        }else if (age>85){
            throw new Exception("You are a bit old.You can produce an accident");
        }else{
            System.out.println("You can drive if you have a driver license," +
                    "else go to a driving school and get one");
        }

    }

    public static void main(String[] args){
        try {
            toDrive();
        } catch (Exception e) {
            System.out.println("Fact :"+e);
        }
    }
}
