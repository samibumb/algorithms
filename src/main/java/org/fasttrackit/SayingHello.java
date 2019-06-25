package org.fasttrackit;

import java.util.Scanner;

//ex1
public class SayingHello {

    public static void sayHello(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your name :");
        String name=scanner.nextLine();
        System.out.println("Hello "+name);
    }

    public static void main(String[] args){
        sayHello();
    }
}
