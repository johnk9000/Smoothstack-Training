// Java game that user has five tries to guess a number between 1-100 and must be within + or - 10 of the target number
import java.util.Scanner;
//package com.ss.basics.numgame;

public class NumGameJK {
    
    public static void main(String[] args) {
        // Declaring variables
        int targetNum = (int)(Math.random() * 100  + 1);
        int guessNum;
        int count = 0;
        boolean correct = false;

        Scanner input = new Scanner(System.in);
        //System.out.println(targetNum);
        while(!correct) {
            System.out.println("Guess number between 1-100: ");
            guessNum = input.nextInt();
            //conditionals to check to see if user guess is within the range of +/- 10 of target number
            if(guessNum >= targetNum - 10 && guessNum <= targetNum + 10) {
                System.out.println("You are correct!");
                correct = true;
            } else {
                System.out.println("sorry, you have "+(4-count)+" tries remaining.");
                    System.out.println(count); //debug
                    System.out.println(targetNum);
            count++;
            }
        }
    }

}
