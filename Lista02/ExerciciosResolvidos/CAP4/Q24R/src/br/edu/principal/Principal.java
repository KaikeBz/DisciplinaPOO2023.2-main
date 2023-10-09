package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o preço do produto: ");
	        double pre = sc.nextDouble();

	        System.out.print("Digite o tipo do produto (A, L ou V): ");
	        String tipo = sc.next();

	        System.out.print("Digite se o produto é refrigerado (S ou N): ");
	        String refrig = sc.next();

	        double valor_adic, imposto, pre_custo, desconto, novo_pre;

	        if (refrig.equals("N")) {
	            if (tipo.equals("A")) {
	                valor_adic = (pre < 15) ? 2 : 5;
	            } else if (tipo.equals("L")) {
	                valor_adic = (pre < 10) ? 1.50 : 2.50;
	            } else if (tipo.equals("V")) {
	                valor_adic = (pre < 30) ? 3 : 2.50;
	            } else {
	                valor_adic = 0;
	            }
	        } else {
	            if (tipo.equals("A")) {
	                valor_adic = 8;
	            } else {
	                valor_adic = 0;
	            }
	        }

	        System.out.println("Valor adicional: " + valor_adic);

	        if (pre < 25) {
	            imposto = 0.05 * pre;
	        } else {
	            imposto = 0.08 * pre;
	        }

	        System.out.println("Imposto: " + imposto);

	        pre_custo = pre + imposto;

	        System.out.println("Preço de custo: " + pre_custo);

	        if (!tipo.equals("A") && !refrig.equals("S")) {
	            desconto = 0.03 * pre_custo;
	        } else {
	            desconto = 0;
	        }

	        System.out.println("Desconto: " + desconto);

	        novo_pre = pre_custo + valor_adic - desconto;

	        System.out.println("Novo preço: " + novo_pre);

	        if (novo_pre <= 50) {
	            System.out.println("Barato");
	        } else if (novo_pre < 100) {
	            System.out.println("Normal");
	        } else {
	            System.out.println("Caro");
	        }

	        sc.close();
	}

}
