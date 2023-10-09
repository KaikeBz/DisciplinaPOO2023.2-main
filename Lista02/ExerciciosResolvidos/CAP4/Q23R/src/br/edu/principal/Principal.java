package br.edu.principal;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int shift;
        int category = 0;
        do {
            shift = callFirstMenu(sc);
            if(shift==4) {
                break;
            }
            else if (shift != 1 && shift != 2 && shift != 3) {
                System.out.println("Invalid shift. Please choose a valid option (1, 2, 3, 4).");
                shift = callFirstMenu(sc);
                continue;
            }
            category = callSecondMenu(sc);
            if(category!=3) {
                double coefficient = 0;
                System.out.printf("Insert here the minimum salary : ");
                double salMin = sc.nextDouble();
                System.out.printf("Insert here how many hours did you work : ");
                double hoursWorked = sc.nextDouble();
             
                if(shift == 1) {
                    coefficient = salMin /10;
                }
                else if(shift == 2) {
                    coefficient = salMin * 3/20;
                }
                else if(shift == 3) {
                    coefficient = salMin * 3/25;
                    
                }
            System.out.println("Your coefficient is " + coefficient);
            double salTotal = coefficient * hoursWorked;
            System.out.println("Your total salary is " + salTotal);
            double tax = 0;
            if(category==1) {
            	if(salTotal>=300) {
            		tax = salTotal * 5/100; 
            	}else {
            		 tax = salTotal * 3/100;
            	}
            }
            else if(category==2){
            	if(salTotal>=400) {
            	tax = salTotal * 3/50; 
            	}
            	else{
        		 tax = salTotal * 2/50;
        	}}
            System.out.println("Your tax is " + tax);
            double grat=0;
            if(shift==3 && hoursWorked > 80) {
            	grat=80;
            }else {
            	grat=30;
            }
            System.out.println("Your gratification is " + grat);
            double ass= 0;
            if(category ==1 || coefficient <=25) {
            	ass = salTotal/3;
            }else {
            	ass = salTotal/2;
            }
            System.out.println("Your assistance is  " + ass);
            double liquidSal = salTotal - tax + grat + ass;
            System.out.println("You will receive $" + liquidSal);
            if(liquidSal<350) {
            	System.out.println("Underpaid");
            }else if(liquidSal >= 350 && liquidSal <=600) {
            	System.out.println("Normal");
            }else {
            	System.out.println("Well paid");
            }
            }
        } while(category!=3);
        sc.close();
        System.out.println("See you soon!");
    }
	
	public static int callFirstMenu(Scanner sc) {
		System.out.println("--  MENU   --");
		System.out.println("[1] Morning");
		System.out.println("[2] Afternoon");
		System.out.println("[3] Night");
		System.out.println("[4] EXIT ");
		System.out.println("-------------");
		System.out.printf("Insert here your option : ");
		return getInt(sc);
	}
		
	public static int callSecondMenu(Scanner sc) {	
		System.out.println("--  MENU   --");
		System.out.println("[1] Worker  ");
		System.out.println("[2] Manager ");
		System.out.println("[3] EXIT ");
		System.out.println("-------------");
		System.out.printf("Insert here your option : ");
		
		return getInt(sc);
		
	}
	public static int getInt(Scanner sc) {
		while(!sc.hasNextInt()) {
			System.out.println("Invalid input, please try again : ");
			sc.next();
		}
		return sc.nextInt();
	}
	
}