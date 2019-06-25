package org.fasttrackit;

import java.util.Scanner;

//ex5
public class SimpleMath {

    public static void calculate(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("First number :");
        String firstNr = scanner.nextLine();

        System.out.print("Second number :");
        String secondNr = scanner.nextLine();

        int a=Integer.parseInt(firstNr);
        int b=Integer.parseInt(secondNr);

        int sum=a+b;
        int dif=a-b;
        int multiply=a*b;
        int division=a/b;

        System.out.println("+ :"+sum+"\n- :"+dif+"\n* :"+multiply+"\n/ :"+division);
    }

    public static void main(String[] args){

        calculate();
    }
}
