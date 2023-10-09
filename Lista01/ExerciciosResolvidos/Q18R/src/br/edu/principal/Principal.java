package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o peso do saco de ração em kg? ");
		int saco_racao_kg = sc.nextInt();
		
		System.out.print("Quantos gramas cada gato come de ração por dia? ");
		int dia_racao_gr = sc.nextInt();
		
		int saco_racao_gr = saco_racao_kg * 1000;
		int semana_racao_gr = (dia_racao_gr*5)*2;
		int resto_racao_gr = saco_racao_gr - semana_racao_gr;
		
		System.out.println("Depois de 5 dias sobrou " + resto_racao_gr + " gramas de ração.");
		
		sc.close();		
	}

}
