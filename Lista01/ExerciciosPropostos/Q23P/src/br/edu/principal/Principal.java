/**
 * Question Number : 23P
   10 de set. de 2023
   Made by : Lucas G.
   Teacher : Roger Sarmento
 */
package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insert here the value of the first angle of your triangle : ");
		double angle1 = sc.nextDouble();
		System.out.printf("Insert here the value of the second angle of your triangle : ");
		double angle2 = sc.nextDouble();
		sc.close();
		double angle3 = 180-angle1-angle2;
		System.out.println("The value of the third angle is : " + angle3);
		
		
	}

}
