package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media, notaExame;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3.0;
        System.out.println("Média aritmética: " + media);

        if (media >= 0 && media < 3) {
            System.out.println("Você foi reprovado");
        } else if (media >= 3 && media < 7) {
            System.out.println("Você deverá fazer o exame");
            notaExame = 12 - media;
            System.out.println("Deve tirar nota " + notaExame + " para ser aprovado");
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        }
        sc.close();
	}

}
