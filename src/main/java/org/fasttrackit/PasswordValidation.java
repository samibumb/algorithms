package org.fasttrackit;

import javax.swing.*;
import java.util.Scanner;

public class PasswordValidation {

    public static void validate() throws Exception {

        Scanner scanner = new Scanner(System.in);
        int maxAttempts=3;
        int attempts=0;

        while(attempts<maxAttempts) {
            System.out.print("Input username");
            String user = scanner.nextLine();

            System.out.print("Input password");
            String password = scanner.nextLine();

            if (user.equals("sami") && password.equals("samieboss")) {
                JOptionPane.showMessageDialog(null, "You are in");
                break;
            } else if(password.equals("sami")){
                System.out.println("password");
                break;
        }else{
                System.out.println("Try again");
            }
            attempts++;


        }
        if (attempts==maxAttempts){
            System.out.println("Try again later");
        }
    }

    public static void main(String[] args)throws Exception{
        validate();
    }
}
