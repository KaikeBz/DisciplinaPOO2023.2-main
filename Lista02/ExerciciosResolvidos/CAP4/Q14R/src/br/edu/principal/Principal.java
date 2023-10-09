package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        double sal = sc.nextDouble();
        double novo_sal, boni, aux;

        if (sal <= 500) {
            boni = sal * 5 / 100;
        } else if (sal <= 1200) {
            boni = sal * 12 / 100;
        } else {
            boni = 0;
        }

        if (sal <= 600) {
            aux = 150;
        } else {
            aux = 100;
        }

        novo_sal = sal + aux + boni;
        System.out.println("Novo salário: " + novo_sal);

        sc.close();
	}

}
