package com.zenith;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MarsAdventureGame {
    Scanner scanner = new Scanner(System.in);
    private String userName;
    private String animalName;

   public void gameStart(){
       String line = "The game is about to start... \n" +
               "Booting up...\n" +
               "...\n" +
               "...\n" +
               "...\n" +
               "Ready";
       System.out.println(line);
//       Scanner scanner = new Scanner(System.in);
       System.out.println("Hi there. What's your name?");

       while(true){
           userName = scanner.nextLine();
           if(!userName.trim().equals("")){
               System.out.println("Hi," + userName + " --- Welcome to The Mars Adventure Game. \n"
                       + "Yesterday, you received a call from your good friend at NASA. \n"
                       + "They need someone to go to Mars this weekend, and you've been chosen.");
               break;

           } else {
               System.out.println("You did not enter your name. Type your name to proceed to play the game");
           }
       }

   }

   public void isExcited(){
       System.out.println("Are you excited? type Y or N");
       String excited = scanner.nextLine().toUpperCase();
       while(true) {
           if (excited.trim().equalsIgnoreCase("Y")) {
               System.out.println("I knew you'd say that. It's so cool that you're going to Mars! \n"
                       + "It's time to pack for your trip to Mars. \n"
               );
               break;
           } else if (excited.trim().equalsIgnoreCase("N")) {
               System.out.println("Too bad! It would have been a worldly experience");
               System.exit(0);
               break;
           } else {
               System.out.println("Wrong letter entered. Enter either 'Y' or 'N' ");
           }
           excited = scanner.nextLine().toUpperCase();
       }
   }

   public void suitcases() {
       System.out.println("How many suitcases do you plan to bring?");


       while (true) {
           try {
               int numberOfSuitcases = scanner.nextInt();

               if (numberOfSuitcases <= 2 && numberOfSuitcases > 0) {
                   System.out.println("That's perfect. You are allowed to bring " + numberOfSuitcases + " suitcases");
                   scanner.nextLine();
                   break;
               } else {
                   System.out.println("That's way too many. You'll have to pack more lightly \n"
                           + "Please try to fit your stuff into 2 suitcases.");
               }
           } catch (InputMismatchException e) {
               scanner.next();
               System.out.println("Invalid input. Enter only integers");
               ;
           }
       }
   }

   public void animalDesc() {
       String animal;
       System.out.println("You're allowed to bring one companion animal with you");
       System.out.println("What kind of companion animal would you like to bring?");
       while (true) {
           animal = scanner.nextLine();
           animal =animal.trim();
           if (!animal.isEmpty()) {
               break;
           } else {
               System.out.println("Warning! you need to enter your animal");
           }
       }

       System.out.println("What is your companion's name?");
       while (true) {
           animalName = scanner.nextLine();
           animalName=animalName.trim();

           if (!animalName.isEmpty()) {
               System.out.println("Cool, so you're bringing " + animalName + " the " + animal);
               break;
           } else {
               System.out.println("Did you forget to enter your animal name? We would like to know your animal's name. Your animal name is : ");
           }

       }
   }

   public void chooseSpaceship(){
       System.out.println("NASA has a interior design team offering to outfit your space ship.\n" +
               "You have a couple of options for the interior decor of your ship.");
       System.out.println("Your options are:\n" +
               " A  Sleek, modern minimalism\n" +
               " B  Retro/vintage space age\n" +
               " C  SF Hippie chic\n" +
               "Which decor would you like? Choose A, B, or C.");

       boolean loop=true;
       while (loop) {
           String chooseOption = scanner.nextLine();
           chooseOption = chooseOption.toUpperCase();
           switch(chooseOption) {
               case "A" :
                   System.out.println("Great! get ready for the ride in Sleek, Modern minimalism");
                   loop=false;
                   break;
               case "B":
                   System.out.println(userName + " and " + animalName + " surfing the Retro spaceship " );
                   loop=false;
                   break;
               case "C":
                   System.out.println("SF Hippie chic is going to be fun");
                   loop=false;
                   break;
               default:
                   System.out.println("Enter either A, B or C");
                   break;
           }

       }
   }

   public void endGame(){
       System.out.println( userName + "-- the day is here!\n" +
               "You crawl into the spaceship with Buster\n" +
               "Brace for take off!\n" +
               "5 ...\n" +
               "4 ...\n" +
               "3 ...\n" +
               "2 ...\n" +
               "1 ...\n" +
               "* LIFTOFF *");
   }
}
