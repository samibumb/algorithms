package org.fasttrackit;

import java.util.Scanner;

//ex2
public class NrOfCharacters {

    public static void count(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a string :");
        String input=scanner.nextLine();
        int i;
        for (i=0;i<input.length();i++){

        }
        System.out.println(input+" has "+i+" elements");
    }

    public static void main(String[] args){
        count();
    }
}
