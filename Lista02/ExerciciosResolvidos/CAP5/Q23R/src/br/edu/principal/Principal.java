package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sal,qtd,type;
		double total,valueKw,expenses,totalGeneral = 0,inc = 0,qtdCons = 0;
		
		System.out.printf("Enter here your salary : ");
		sal = sc.nextInt();
		System.out.printf("Enter here how many KW did you use : ");
		qtd = sc.nextInt();
		valueKw= sal/8;
		while(qtd!=0) {
			
			expenses = qtd * valueKw;
			System.out.printf("Enter here the type of your energy (1,2,3)");
			type = sc.nextInt();
			if(type == 1) {
				inc= expenses/20;
			}
			else if(type == 2) {
				inc= expenses/10;
			}
			else if(type == 3) {
				inc= expenses*3/20;
			}
			total = expenses + inc ;
			totalGeneral += total;
			if(total >=500 && total <=1000) {
				qtdCons += 1;
			}
			System.out.println("Consumption cost: " + expenses);
	        System.out.println("Surcharge: " + inc);
            System.out.println("Total cost: " + total);
			System.out.printf("Enter quantity of customers (0 to exit): ");
			qtd = sc.nextInt();
			
			
		}
		System.out.println("Total general cost: " + totalGeneral);
        System.out.println("Number of customers with total cost between 500 and 1000: " + qtdCons);
        
        sc.close();
		
	}

}
