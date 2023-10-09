package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insert here how many yours did you work : ");
		double hoursWorked = sc.nextDouble();
		System.out.printf("Insert here how much is the minimum salary : ");
		double minSal = sc.nextDouble();
		System.out.printf("Insert here how many depentents do you have : ");
		double dep = sc.nextDouble();
		System.out.printf("Insert here how many extra yours did you work : ");
		double extraHours = sc.nextDouble();
		sc.close();
		double valHoursWorked = minSal/5;
		double salMonth = valHoursWorked * hoursWorked;
		double valDep = 32 * dep;
		double valExtraHours = extraHours * (valHoursWorked + (valHoursWorked/2));
		double salTotal = salMonth + valDep + valExtraHours;
		double tax;
		if(salTotal <200) {
			tax =0;
		}else if(salTotal >=200 && salTotal<=500) {
			tax = salTotal/10;
		}else{
			tax = salTotal/5;
		}
		double liquidSal = salTotal - tax;
		double grat;
		if(liquidSal<=350) {
			grat = 100;
		}
		else {
			grat = 50;
		}
		double salToReceive = liquidSal + grat;
		System.out.println("You will receive : $" + salToReceive);
	}
	
}
