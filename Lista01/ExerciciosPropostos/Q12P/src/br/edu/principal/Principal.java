/**
 * Question Number : 
   10 de set. de 2023
   Made by :
   Teacher : Roger Sarmento
 */
package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 */
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.print("Insert here the value of a minimum salary : ");
		double salMin = sc.nextDouble();
		System.out.print("Insert here your salary : ");
		double yourSal = sc.nextDouble();
		sc.close();
		if(salMin ==0) {
			 System.out.print("Insert the right value of minimun salary");
		}else {
		
		
		double qnt = yourSal/salMin;
		System.out.printf("You recieve " + df.format(qnt) + " minimum salaries");
		}
	}
}
