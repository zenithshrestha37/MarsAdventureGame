package com.zenith;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String line = "The game is about to start... \n" +
                "Booting up...\n" +
                "...\n" +
                "...\n" +
                "...\n" +
                "Ready";
        System.out.println(line);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi there. What's your name?");
        String userName = scanner.nextLine();

        System.out.println("Hi," + userName + " --- Welcome to The Mars Adventure Game. \n"
                + "Yesterday, you received a call from your good friend at NASA. \n"
                + "They need someone to go to Mars this weekend, and you've been chosen.");

        System.out.println("Are you excited? type Y or N");

        while(true) {
            String excited = scanner.nextLine();
            if (excited.equalsIgnoreCase("Y")) {
                System.out.println("I knew you'd say that. It's so cool that you're going to Mars! \n"
                        + "It's time to pack for your trip to Mars. \n"
                );
                break;
            } else if (excited.equalsIgnoreCase("N")) {
                System.out.println("Too bad! It would have been a worldly experience");
                System.exit(0);
            } else {
                System.out.println("Wrong letter entered. Enter either 'Y' or 'N' ");
            }
        }

        System.out.println("How many suitcases do you plan to bring?");


        while(true) {
            int numberOfSuitcases = scanner.nextInt();

            if (numberOfSuitcases <= 2 && numberOfSuitcases > 0) {
                System.out.println("That's perfect. You are allowed to bring" + numberOfSuitcases + "suitcases");
                break;
            } else {
                System.out.println("That's way too many. You'll have to pack more lightly \n"
                        + "Please try to fit your stuff into 2 suitcases.");
            }
        }

        System.out.println("You're allowed to bring one companion animal with you.\n"
                + "What kind of companion animal would you like to bring?");
        String animal = scanner.nextLine();

        System.out.println("What is your companion's name?");
        String animalName = scanner.nextLine();

        System.out.println("Cool, so you're bringing Buster the frog");

        System.out.println("NASA has a interior design team offering to outfit your space ship.\n" +
                "You have a couple of options for the interior decor of your ship.");


//        Map<String, String> spaceShip = new HashMap<>();
//        spaceShip.put("A","Sleek, modern minimalism");
//        spaceShip.put("B", "Retro/vintage space age");
//        spaceShip.put("C", "SF Hippie chic");

        System.out.println("Your options are:\n" +
                " A  Sleek, modern minimalism\n" +
                " B  Retro/vintage space age\n" +
                " C  SF Hippie chic\n" +
                "Which decor would you like? Choose A, B, or C.");

        boolean loop=true;
        while (loop) {
            String chooseOption = scanner.nextLine();
            chooseOption = chooseOption.toLowerCase();
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
        System.out.println("Rubber duck -- the day is here!\n" +
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
