package org.fasttrackit;

import java.util.Scanner;

//ex21
public class NumbersToNames {

   public static void numbersToNames() {
       String[] months = {"0","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
       String[] n = {"0","first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
       Scanner scanner = new Scanner(System.in);

       System.out.println("Introduce a number");
       int nr=scanner.nextInt();
       String month=months[nr];
       String num=n[nr];
       System.out.println("The "+num+" month is "+month);
   }

    public static void main( String[] args ) {
        numbersToNames();
    }

}
