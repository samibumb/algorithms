package org.fasttrackit;

import exceptions.TooMuchAlcoholException;

//ex18
public class BloodAlcoholCalculator {

    public static void calculateAlcohol(double drinkedByMan, double drinkedByWomen) throws TooMuchAlcoholException {

        double maxForMan=0.08;
        double maxForWomen=0.66;

        System.out.println("-----Test alcohol for man-----");

        if (drinkedByMan>=maxForMan){
            throw new TooMuchAlcoholException("Go to sleep");
        }else if (drinkedByMan<maxForMan){
            System.out.println("Keep drinking");
        }

        System.out.println("\n-----Test alcohol for woman-----");

        if (drinkedByWomen>=maxForWomen){
            throw new TooMuchAlcoholException("Go to sleep");
        }else if (drinkedByMan<maxForMan){
            System.out.println("Keep drinking");
        }



    }

    public static void main(String[] args) throws TooMuchAlcoholException {
        calculateAlcohol(0.08,0.1);
    }
}
