/**
 * Question Number : 15
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
		System.out.printf("Insert here the price of fabrication : ");
		double pFab =  sc.nextDouble() ;
		System.out.printf("Insert here the percentual of profit   : ");
		double percD =  sc.nextDouble() ;
		System.out.printf("Insert here the percentual of taxs : ");
		double percI =  sc.nextDouble() ;
		double vlrD = pFab * percD/100;
		double vlrI = pFab * percI/100;
		double pFinal = pFab + vlrI +vlrD;
		System.out.println("Value of taxs : " + df.format(vlrI));
		System.out.println("Value of profit : " + df.format(vlrD));
		System.out.println("Value of final price : " + df.format(pFinal));}
		finally{
			sc.close(); 
			}

	}

}
