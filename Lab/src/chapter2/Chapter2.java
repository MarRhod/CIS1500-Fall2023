package chapter2;

import java.util.Scanner;

public class Chapter2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What time do you go to sleep? ");

        double timeSpentSleep = Double.parseDouble(keyboard.nextLine());

        System.out.println("What time do you wake up?");

        Double wakeUpTime = Double.parseDouble(keyboard.nextLine());

        Double toatalTime = timeSpentSleep - wakeUpTime;

        System.out.println("You get " + toatalTime + " Hours of sleep");




    }
}
