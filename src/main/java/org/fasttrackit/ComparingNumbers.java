package org.fasttrackit;

import java.util.Scanner;

//ex22
public class ComparingNumbers {

    public static void compare(){

        Scanner sc = new Scanner(System.in);
        int max=0;
        System.out.println("Dati a");
        int a=sc.nextInt();
        System.out.println("Dati b");
        int b=sc.nextInt();
        System.out.println("Dati c");
        int c=sc.nextInt();

        if (a>b){
            max=a;
            System.out.println("The biggest number is a :"+max);
        }else if (b<a){
            max=b;
            System.out.println("The biggest number is b :"+max);
        }else if (a>c){
            max=a;
            System.out.println("The biggest number is a :"+max);
        }else if (a<c){
            max=c;
            System.out.println("The biggest number is c :"+max);
        }else if (b>c){
            max=b;
            System.out.println("The biggest number is b :"+max);
        }else if (b<c){
            max=c;
            System.out.println("The biggest number is c :"+max);
        }


    }
    public static void main(String[] args){
        compare();
    }


}
