package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço atual: ");
        double pre = sc.nextDouble();

        System.out.print("Digite a quantidade mensal da venda: ");
        double venda = sc.nextDouble();

        double novo_pre;

        if (venda < 500 || pre < 30) {
            novo_pre = pre + (0.10 * pre);
        } else if ((venda >= 500 && venda < 1200) || (pre >= 30 && pre < 80)) {
            novo_pre = pre + (0.15 * pre);
        } else if (venda >= 1200 || pre >= 80) {
            novo_pre = pre - (0.20 * pre);
        } else {
            novo_pre = pre;
        }

        System.out.println("Novo preço: " + novo_pre);

        sc.close();
	}

}
