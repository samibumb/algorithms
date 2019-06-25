package org.fasttrackit;

import java.util.Scanner;

//ex23
public class TroubleshootingCarIssues {

    public static void carIssue() {
        String firstQuestion = "Is the car silent when you turn the key?";
        String YESsecondquestion = "Are the battery terminals corroded?";
        String NOsecondQuestion = "Does the car make a clicking noise?";
        String YESanswer = "Clean terminals and try starting again.";
        String NOanswer = "Replace cables and try again.";

        System.out.println(firstQuestion);

        Scanner sc=new Scanner(System.in);
        String answer=sc.nextLine();


        if (answer.equals("yes")){

            System.out.println(YESsecondquestion);

            String secondAnswer=sc.nextLine();

            if (secondAnswer.equals("yes")){
                System.out.println(YESanswer);
            }else{
                System.out.println(NOanswer);
            }

        }else if (answer.equals("no")){

            System.out.println(NOsecondQuestion);
        }
    }
    public static void main(String[] args){
        carIssue();
    }

}
