/**
 * Question Number : 
   26 de ago. de 2023
   Made by :
   Teacher : Roger Sarmento
 */
package br.edu.principal;

import java.util.Scanner;

/**
 * 
 */
public class Principal {

	public static void main (String [] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.printf("Insert here the price of your spectacle : ");
			double price = sc.nextDouble();
			System.out.printf("Insert here the price of the invitations : ");
			double invitationPrice = sc.nextDouble();
			double qntInvitations = price/invitationPrice;
			System.out.printf("You will need to sell " + Math.ceil(qntInvitations) + " invitations");
		}
		}
		
	}

