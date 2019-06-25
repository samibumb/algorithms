package org.fasttrackit;

import java.util.Scanner;

//ex7
public class AreaOfRectangularRoom {

    public static void area(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");
        double length=scanner.nextDouble();

        System.out.println("What is the width of the room in feet?");
        double width=scanner.nextDouble();

        System.out.println("You entered dimensions of "+length+" feet by "+width+" feet.");

        double areaInFeet=length*width;
        System.out.println("Area in feet :"+areaInFeet);

        double areaInSquareMeters=areaInFeet*areaInFeet*0.09290304;
        System.out.println("Area in square meters :"+areaInSquareMeters);
    }

    public static void main(String[] args){
        area();
    }

}
