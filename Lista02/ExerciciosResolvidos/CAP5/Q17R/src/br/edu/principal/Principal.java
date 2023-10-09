package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double salCarlos,salJoao;
		int months = 0;
		System.out.printf("Enter here the salary of Carlos : ");
		salCarlos = sc.nextDouble();
		sc.close();
		salJoao = salCarlos/3;
		while(salJoao < salCarlos) {
			salCarlos += (salCarlos/50 );
			salJoao += (salJoao/20 );
			months += 1; 
		}
		System.out.println("The salary of Joao will be equal or higher than Carlos's salary in " + months + " months");
		
		
	}

}
