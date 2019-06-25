package org.fasttrackit;

import java.util.Scanner;

//ex4
public class MadLib {

    public static void mad(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Noun :");
        String noun=scanner.nextLine();

        System.out.print("Verb :");
        String verb=scanner.nextLine();

        System.out.print("Adjective :");
        String adjective=scanner.nextLine();

        System.out.print("Adverb :");
        String adverb=scanner.nextLine();


            System.out.println("Do you "+verb+" your "+adjective+" "+noun+" "+adverb+"?\nThat's hilarious!");

    }
    public static void main(String[] args){
        mad();
    }
}
