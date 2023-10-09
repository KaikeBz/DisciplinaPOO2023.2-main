/**
 * Question Number : 9
   25 de ago. de 2023
   Made by : Lucas G.
   Teacher : Roger Sarmento
 */
package br.edu.principal;
import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Write here the base of your triangle in centimeters : ");
		double base = scanner.nextDouble();
		System.out.print("Write the height of your triangle in centimeters : ");
		double height = scanner.nextDouble();
		double area = (base * height )/2;
		System.out.println("The area of your triangle is equal to : " + area + " cm x cm");
	}

}
