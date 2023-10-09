package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do produto (1 a 10): ");
        int cod_prod = sc.nextInt();

        System.out.print("Digite o peso em quilos: ");
        double peso_quilos = sc.nextDouble();

        System.out.print("Digite o código do país (1, 2 ou 3): ");
        int cod_pais = sc.nextInt();

        double peso_gramas = peso_quilos * 1000;
        System.out.println("Peso em gramas: " + peso_gramas);

        double pre_grama = 0;
        if (cod_prod >= 1 && cod_prod <= 4) {
            pre_grama = 10;
        } else if (cod_prod >= 5 && cod_prod <= 7) {
            pre_grama = 25;
        } else if (cod_prod >= 8 && cod_prod <= 10) {
            pre_grama = 35;
        }

        double pre_total = peso_gramas * pre_grama;
        System.out.println("Preço total: " + pre_total);

        double imposto = 0;
        if (cod_pais == 2) {
            imposto = pre_total * 15 / 100;
        } else if (cod_pais == 3) {
            imposto = pre_total * 25 / 100;
        }
        System.out.println("Imposto: " + imposto);

        double valor_total = pre_total + imposto;
        System.out.println("Valor total: " + valor_total);

        sc.close();
	}

}
