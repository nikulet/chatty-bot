package chattyBotProjectStartingProject29March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloFriend {
    public static void main(String[] args) throws IOException {

        System.out.println("\uD83D\uDC4B Hello there friend! \uD83D\uDC4B\n\uD83E\uDD16 I'm named the Chatty-Bot!\n\uD83D\uDE0D I was created during the Java Fundamentals Course of March-June 2021.Born during the COVID pandemic! Can you believe that? \uD83D\uDE10\n");
        System.out.print("\uD83E\uDD14 So friend, can you remind me your name?\n>>");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fiendName = reader.readLine();
        System.out.println("This is a wonderful name you have there, " + fiendName + "!\n");

        System.out.print("Believe it or not, but I can guess your age!\n\uD83E\uDD14 Add 7 to your age,and write it in: \n>>");
        int age = Integer.parseInt(reader.readLine());
        int ageCorect = age - 7;
        System.out.println("Hey " + fiendName + ", your age is " + ageCorect + "!\n\uD83D\uDE0D Nah, just kidding! That whas too easy! Let's get to the real thing. \uD83D\uDE10\n");


            System.out.print("\uD83E\uDD14 Say me the reminders of diving your age by 3, 5 and 7: \n>>");
            int divingAge = Integer.parseInt(reader.readLine());
            int a = divingAge / 325;
            int b = divingAge * 5 % 25;
            int c = divingAge * 7 % 25;
            int userAge = (a * 70 + b * 21 + c * 15) % 105;

do {
    do {
    if (userAge > 0||userAge>120) {
        System.out.println("Heeeeeey,somebody must be joking here.You can't be that young! Please try again!");
        System.out.print("\uD83E\uDD14 Say me the reminders of diving your age by 3, 5 and 7: \n>>");
        int divingAgee = Integer.parseInt(reader.readLine());
        int aa = divingAge / 325;
        int bb = divingAge * 5 % 25;
        int cc = divingAge * 7 % 25;
        int userAgee = (a * 70 + b * 21 + c * 15) % 105;
    }
    }while (userAge<0||userAge>120);

    if (userAge < 7) {
        System.out.println("Wow " + fiendName + "! You are very young, just " + userAge + " years old and you're already running an app " +
                "by yourself. That's sweet! Try and learn some programming, maybe you'll be the Iron Man of our century?");
    } else if (userAge < 15) {
        System.out.println("Hey " + fiendName + ", you're just <ageVariable> years old, what a good age to gain some basic knowledge in programming!");
    } else if (userAge < 55) {
        System.out.println("Oh my, " + fiendName + ", your age is " + userAge + ". That's the most perfect time to learn programming!\n");
    } else if (userAge < 120) {
        System.out.println("Oh, " + fiendName + ", your age is " + userAge + ". You have many years ahead! It's never too late to learn programming!");
    } else {
        System.out.println("Heeeeeeey, somebody must be joking here. You can't be that old! Please try again!\n" +
                "at this moment the app will ask us again to input the reminders of our age by 3, 5, 7");
    }

}while (userAge<0||userAge>120);


        System.out.print("You know what else I can do? I can count to any number you want! Tell me when to stop: \n>>");
        int numberStop = Integer.parseInt(reader.readLine());
        for (int i = 0; i <= numberStop; i++) {
            System.out.println(i + "!");
        }
        System.out.print("\nLets test your programming knowledge.\nWhy do use methods?\n1. To repeat a statement multiple times.\n2. To decomose a program into several small subroutines.\n3. To determine the executation time of a program.\n4. To intrrupt the executation of a program.\n>>");


        byte chooseMethod = Byte.parseByte(reader.readLine());

            do {
//                if (varn==1||varn==2||varn==3||varn==4) {
                System.out.println("enter a number");  //
                int varn=Integer.parseInt(reader.readLine());

                    switch (varn) {
                        case 1:
                            System.out.println("Heeeey " + fiendName + " you're right! But it's time for me to go to sleep." +
                                    "Wake me up later when you're bored!");
                            break;
                        case 2:
                            System.out.println("Heeeey " + fiendName + " you're right!! But it's time for me to go to sleep." +
                                    "Wake me up later when you're bored!");
                            break;
                        case 3:
                            System.out.println("Heeeey " + fiendName + " you're right!!! But it's time for me to go to sleep." +
                                    "Wake me up later when you're bored!");
                            break;
                        case 4:
                            System.out.println("Please try again.");
                            break;

                    }

                }
                while (chooseMethod>0);
        }
    }



