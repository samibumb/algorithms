package org.fasttrackit;

import java.util.Scanner;

//ex19
public class TemperaturConverter {

    public static void convert(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.\n");
        System.out.println("Press F to convert from Celsius to Fahrenheit.\n");
        String pressKey=sc.nextLine();
        System.out.println("Ati ales "+pressKey);
        if (pressKey.equals("C")){
            System.out.print("Dati gradele fahrenheit");
            int fahrenHeit=sc.nextInt();
            int celsius=(fahrenHeit-32)*5/9;
            System.out.println("Temperatura in grade celsius :"+celsius);

        }else if (pressKey.equals("F")){
            System.out.print("Dati gradele celsius");
            int celsius=sc.nextInt();
            int fahrenHeit=(celsius*9/5)+32;
            System.out.println("Temperatura in grade fahrenheit :"+fahrenHeit);
        }

    }
    public static void main( String[] args ) {
        convert();
    }
}
