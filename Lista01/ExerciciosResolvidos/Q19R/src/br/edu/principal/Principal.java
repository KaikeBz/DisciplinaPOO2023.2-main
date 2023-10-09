/**
 * Question Number : 19
   26 de ago. de 2023
   Made by : Lucas G.
   Teacher : Roger Sarmento
 */
package br.edu.principal;

import java.util.Scanner;

/**
 * 
 */
public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.printf("Insert here the hight of your step (in meters): ");
		double step = sc.nextDouble();
		System.out.printf("Insert here how much do you want to climb (in meters) : "  );
		double distance = sc.nextDouble() ;
		double qntstep = distance/step;
		System.out.printf("You will climb " + Math.floor(qntstep) + " steps");
		} finally {
			sc.close();
		}
		
	}
	
}
