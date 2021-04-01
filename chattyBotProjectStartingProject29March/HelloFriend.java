package chattyBotProjectStartingProject29March.chattyBotProjectStartingProject29March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloFriend {
    public static void main(String[] args) throws IOException {

        System.out.println("\uD83D\uDC4B Hello there friend! \uD83D\uDC4B\n\uD83E\uDD16 I'm named the Chatty-Bot!\n\uD83D\uDE0D I was created during the Java Fundamentals Course of March-June 2021.Born during the COVID pandemic! Can you believe that? \uD83D\uDE10\n");
        System.out.print("\uD83E\uDD14 So friend, can you remind me your name?\n>>");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String friendName = reader.readLine();
        System.out.println("This is a wonderful name you have there, " + friendName + "!\n");

        System.out.print("Believe it or not, but I can guess your age!\n\uD83E\uDD14 Add 7 to your age,and write it in: \n>>");
        int age = Integer.parseInt(reader.readLine());
        int ageCorect = age - 7;
        System.out.println("Hey " + friendName + ", your age is " + ageCorect + "!\n\uD83D\uDE0D Nah, just kidding! That whas too easy! Let's get to the real thing. \uD83D\uDE10\n");


        System.out.print("\uD83E\uDD14 Say me the reminders of diving your age by 3, 5 and 7: \n>>");
        int divingAge = Integer.parseInt(reader.readLine());
        int a = ageCorect % 3;
        int b = ageCorect % 5;
        int c = ageCorect % 7;
        int userAge = (a * 70 + b * 21 + c * 15) % 105;


        for (; userAge < 0 || userAge > 120; ) {
            System.out.println("Heeeeeey,somebody must be joking here.You can't be that young! Please try again!");
            System.out.print("\uD83E\uDD14 Say me the reminders of diving your age by 3, 5 and 7: \n>>");
        }

         if (divingAge < 7) {
            System.out.println("Wow " + friendName + "! You are very young, just " + userAge + " years old and you're already running an app " +
                    "by yourself. That's sweet! Try and learn some programming, maybe you'll be the Iron Man of our century?\n");
        } else if (divingAge < 15) {
            System.out.println("Hey " + friendName + ", you're just <ageVariable> years old, what a good age to gain some basic knowledge in programming!\n");
        } else if (divingAge < 55) {
            System.out.println("Oh my, " + friendName + ", your age is " + userAge + ". That's the most perfect time to learn programming!\n");
        } else {
            System.out.println("Oh, " + friendName + ", your age is " + userAge + ". You have many years ahead! It's never too late to learn programming!\n");
        }


        System.out.print("You know what else I can do? I can count to any number you want! Tell me when to stop: \n>>");
        int numberStop = Integer.parseInt(reader.readLine());
        for (int i = 0; i <= numberStop; i++) {
            System.out.println(i + "!");
        }
        System.out.print("\nLets test your programming knowledge.\nWhy do use methods?\n1. To repeat a statement multiple times.\n2. To decomose a program into several small subroutines.\n3. To determine the executation time of a program.\n4. To intrrupt the executation of a program.\n>>");


        int va = Integer.parseInt(reader.readLine());

        for (; va < 0 || va == 4; ) {
            System.out.print("\uD83D\uDE12 Please try again.\n>>");
            int vaa = Integer.parseInt(reader.readLine());
            if (vaa == 1 || vaa == 2 || vaa == 3) {
                switch (vaa) {
                    case 1:
                        System.out.println("Heeeey " + friendName + " you're right! But it's time for me to go to sleep." +
                                "Wake me up later when you're bored!");
                        break;
                    case 2:
                        System.out.println("Heeeey " + friendName + " you're right!! But it's time for me to go to sleep." +
                                "Wake me up later when you're bored!");
                        break;
                    case 3:
                        System.out.println("Heeeey " + friendName + " you're right!!! But it's time for me to go to sleep." +
                                "Wake me up later when you're bored!");
                        break;
                }
                break;
            }
        }

        for (; va == 1 || va == 2 || va == 3; ) {

            switch (va) {
                case 1:
                    System.out.println("Heeeey " + friendName + " you're right! But it's time for me to go to sleep." +
                            "Wake me up later when you're bored!");
                    break;
                case 2:
                    System.out.println("Heeeey " + friendName + " you're right!! But it's time for me to go to sleep." +
                            "Wake me up later when you're bored!");
                    break;
                case 3:
                    System.out.println("Heeeey " + friendName + " you're right!!! But it's time for me to go to sleep." +
                            "Wake me up later when you're bored!");
                    break;
            }
            break;
        }
    }
}










