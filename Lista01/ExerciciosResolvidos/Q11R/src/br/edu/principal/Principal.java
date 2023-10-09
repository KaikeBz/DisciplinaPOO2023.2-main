	/**
	 * Question Number : 11
	   26 de ago. de 2023
	   Made by : Lucas G.
	   Teacher : Roger Sarmento
	 */
	package br.edu.principal;
	
	
	import java.text.DecimalFormat;
	import java.util.Scanner;
	
	public class Principal {
	
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			DecimalFormat df = new DecimalFormat("#.##");
			try {
			System.out.print("Write here your number : ");
			double num = sc.nextDouble();
			double square = Math.pow(num,2);
			double cube = Math.pow(num,3);
			double root2 = Math.sqrt(num);
			double root3 = Math.cbrt(num);
			System.out.println("The number you squared is equal  " + square);
			System.out.println("The number you entered into the cube is equal to  " + cube);
			System.out.println("The square root of the number you entered is equal to " + df.format(root2));
			System.out.println("The cubic root of the number you entered is equal to  " + df.format(root3));
			} finally {
				sc.close();
			}
			
		}
	
	}
