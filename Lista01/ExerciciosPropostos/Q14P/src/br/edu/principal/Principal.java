/**
 * Question Number : 14
   10 de set. de 2023
   Made by : Lucas G.
   Teacher : Roger Sarmento
 */
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador =0;
		System.out.printf("Insert here the exatly year you was born : ");
		int yearBorn = sc.nextInt();
		System.out.printf("Insert here the year that you're using this program : ");
		int yearToday = sc.nextInt();
		sc.close();
		int age = yearToday-yearBorn;
		int ageMonth = age*12;
		
		for(;yearBorn<yearToday;yearBorn++) {
			
			if(yearBorn%4==0 && yearBorn%100!=0 || yearBorn%400==0) {
				contador++;
			}
		}
		
		int ageDays = age*365+contador;
		int ageWeeks = (int)ageDays/7 + ageDays%7;
		
		System.out.println("Your age in years is " + age);
		System.out.println("Your age in months is " + ageMonth);
		System.out.println("Your age in days is " + ageDays);
		System.out.println("Your age in weeks is " + ageWeeks);
		
	}
}
