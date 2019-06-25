package org.fasttrackit;

import exceptions.OutOfPizzaException;

import java.util.Scanner;

//ex8
public class PizzaParty {

    public static void divide() throws InterruptedException, OutOfPizzaException {

        Scanner scanner=new Scanner(System.in);
        System.out.println("How many people?");
        int people=scanner.nextInt();

        System.out.println("How many pizzas do you have?");
        int pizzas=scanner.nextInt();

        System.out.println(people+" people with "+pizzas+" pizzas.");
        System.out.println("People eat one slice");
        for (int i=pizzas;i>=0;i--){
            System.out.println(i+" slices remained.");
            Thread.sleep(1000);
            if (i==0){
                throw new OutOfPizzaException("We are out of pizza,sorry!");
            }
        }

    }

    public static void main(String[] args){
        try {
            divide();
        } catch (InterruptedException | OutOfPizzaException e) {
            System.out.println(e.getMessage());
        }
    }
}
