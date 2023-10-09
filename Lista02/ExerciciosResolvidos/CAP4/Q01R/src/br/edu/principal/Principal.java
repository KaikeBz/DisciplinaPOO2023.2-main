package br.edu.principal;


import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insert here your lab grade : ");
		double grade1 = sc.nextDouble();
		System.out.printf("Insert here your semestral exam grade : ");
		double grade2 = sc.nextDouble();
		System.out.printf("Insert here your final exam grade : ");
		double grade3 = sc.nextDouble();
		sc.close();
	
		double weight = (grade1*2 + grade2*3+ grade3*5)/10;
		System.out.println("Your weighted average is : " + weight);
		
		if(weight>=8 && weight<=10) {
			System.out.println("Concept A");
			
		}
		if(weight>=7 && weight<8) {
			System.out.println("Concept B");
			
		}
		if(weight>=6 && weight<7) {
			System.out.println("Concept C");
			
		}
		if(weight>=5 && weight<6) {
			System.out.println("Concept D");
			
		}
		if(weight>=0 && weight<5) {
			System.out.println("Concept E");
			
		}
		
		
	}

}
