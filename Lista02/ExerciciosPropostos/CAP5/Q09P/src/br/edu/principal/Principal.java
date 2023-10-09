package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
	DecimalFormat df = new DecimalFormat("#.##");
	Scanner sc = new Scanner (System.in);
	int age;
	double weight,height,perc;
	int mediaWeight=0,overWeight = 0, youngP = 0,highestP = 0 ;
	
	for(int i=1;i<=10;i++) {
		
		System.out.printf(" User number "+ i +" enter here your age : ");
		age = sc.nextInt();
		System.out.printf(" User number "+ i +" enter here your weight : ");
		weight = sc.nextDouble();
		System.out.printf(" User number "+ i +" enter here your height : ");
		height = sc.nextDouble();
		System.out.println(" -------------------------------------------- ");
		mediaWeight +=weight;
		
		if(weight >90 &&  height < 1.50) {
			overWeight+=1;
		}
		if(age>10 && age<30) {
			youngP+=1;
			
			if(height>1.9) {
				highestP+=1;
			}
		}
	}
		sc.close();	
		if(highestP!=0) {
		perc = youngP/highestP;
		}else {
			perc = 0;
		}
		System.out.println("The media of the ages is : " + mediaWeight);
		System.out.println("The number of people who is overweight is : " + overWeight);
		System.out.println("The percentual of young people that is high is : " + df.format(perc) + "%");
	
	
	}
}
