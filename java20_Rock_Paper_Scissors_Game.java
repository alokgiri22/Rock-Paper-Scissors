package com.jordanjava;

import java.util.Random;
import java.util.Scanner;

public class java20_Rock_Paper_Scissors_Game {
    public static void main(String[] args) {

//        for Rock Press 1
//        for Paper Press 2
//        for Scissors Press 3

        System.out.println("Game of Rock Paper Scissors using JAVA...");
        System.out.println("Enter your choice(rock, paper or scissors) : ");
        Scanner sc = new Scanner(System.in);
        int yourChoice = sc.nextInt();

        Random rnd = new Random();
        int computerChoice = rnd.nextInt(1, 3);
        // computer's choice between 1, 2 or 3

        if (yourChoice == computerChoice) {
            System.out.println("Game is Draw!!!");
        } else if (yourChoice==1 && computerChoice==3 || yourChoice==2 && computerChoice==1 || yourChoice==3 && computerChoice==2) {
            System.out.println("You are Winner...");
        }
        else {
            System.out.println("Computer Wins...");
        }
        System.out.println("Computers choice is : " + computerChoice);
        if(computerChoice == 1) {
            System.out.println("Computer's choice is : Rock");
        } else if(computerChoice==2 ) {
            System.out.println("Computer's choice is : Paper");
        } else if (computerChoice==3) {
            System.out.println("Computer's choice is : Scissors");
        }
    }
}
