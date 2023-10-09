	package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		int fat,end,x,denominator, numTerms,exp,den	;
		double s;
		System.out.println("Insert here the number of terms : ");
		numTerms = sc.nextInt();
		s =0;
		den=0;
		x = sc.nextInt();
		sc.close();
		denominator = 1;
		for(int i = 1;i <= numTerms;i++) {
			end = denominator;
			fat = 1;
			for(int j = 1;j<=end;j++) {
				fat *= j;
			}
		exp = i + 1 ;
		if(exp%2==0) {
			s =  (s - Math.pow(x, exp))/fat;  
		}
		else{
			s =  (s + Math.pow(x, exp))/fat;  
		}
		if(denominator ==4) {
			den = -1;
		}
		else if(denominator ==1) {
			den = 1;
		}
		if(den==1) {
			denominator+=1;
		}else  {
			denominator-=1;
		}
		}
		System.out.println(s);
	}

}
