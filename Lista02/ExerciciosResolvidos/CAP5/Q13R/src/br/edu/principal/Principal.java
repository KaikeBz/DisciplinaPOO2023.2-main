package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totM=0,totF=0,tot24=0,months;
		double porcM,porcF,porc24;
		System.out.printf("Insert how many children was born in this period : ");
		String gender;
		int numChil = sc.nextInt();
		for (int i = 1;i<=numChil;i++) {
			System.out.printf("Insert here the gender[M or F] of the children number " + i + " :");
			gender = sc.next();
			System.out.printf("Insert here how many months does the children " + i + " has : " );
			months = sc.nextInt();
			if(gender.equalsIgnoreCase("M")){
				totM +=1;
			}
			else if(gender.equalsIgnoreCase("F")){
				totF +=1;
			}
			if(months<=24) {
				tot24 +=1;
			}
			
		}
		sc.close();
		if(numChil == 0) {
			System.out.println("No children were registered");
		}else {
			porcM = totM * 100/numChil;
			porcF = totF * 100/numChil;
			porc24 = tot24 * 100/numChil;
			System.out.println("Percentage of female children that died : " + porcF  );
			System.out.println("Percentage of male children that died : " + porcM);
			System.out.println("Percentage of children aged 24 months or younger who died during the : " + porc24 );
		}
	}
}
