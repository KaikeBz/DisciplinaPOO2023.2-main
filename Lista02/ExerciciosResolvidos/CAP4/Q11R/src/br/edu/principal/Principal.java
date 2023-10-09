package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Insert the hour of the start of the game : ");
        int hourStart = sc.nextInt();
        System.out.print("Insert the minute of the start of the game : ");
        int minuteStart = sc.nextInt();

        System.out.print("Insert the hour of the ending of the game : ");
        int hourEnd = sc.nextInt();
        System.out.print("Insert the minute of the ending of the game : ");
        int minuteEnd = sc.nextInt();

        int hoursDuration, minutesDuration;

        if (hourStart < hourEnd || (hourStart == hourEnd && minuteStart <= minuteEnd)) {
        	hoursDuration = hourEnd - hourStart;
        	minutesDuration = minuteEnd - minuteStart;
        } else {
        	hoursDuration = 24 - hourStart + hourEnd;
        	minutesDuration = minuteEnd - minuteStart;

            if (minutesDuration < 0) {
            	hoursDuration--;
            	minutesDuration += 60;
            }
        }

        System.out.println("Duration of the game : " + hoursDuration + " hours and " + minutesDuration + " minutes.");

        sc.close();
    }
}

