package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira data (dia mês ano): ");
        int dia1 = sc.nextInt();
        int mes1 = sc.nextInt();
        int ano1 = sc.nextInt();

        System.out.println("Digite a segunda data (dia mês ano): ");
        int dia2 = sc.nextInt();
        int mes2 = sc.nextInt();
        int ano2 = sc.nextInt();

        if (ano1 > ano2 || (ano1 == ano2 && mes1 > mes2) || (ano1 == ano2 && mes1 == mes2 && dia1 > dia2)) {
            System.out.println("A primeira data é cronologicamente maior.");
        } else if (ano2 > ano1 || (ano2 == ano1 && mes2 > mes1) || (ano2 == ano1 && mes2 == mes1 && dia2 > dia1)) {
            System.out.println("A segunda data é cronologicamente maior.");
        } else {
            System.out.println("As datas são iguais.");
        }

        sc.close();
	}

}
