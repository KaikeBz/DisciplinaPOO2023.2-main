package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, soma = 0, qtd = 0, maior = 0, menor = 0, qtd_par = 0, qtd_impar = 0, soma_par = 0;
        double media = 0, media_par = 0, perc = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num != 30000) {
            if (qtd == 0) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
            
            soma += num;
            qtd++;

            if (num % 2 == 0) {
                soma_par += num;
                qtd_par++;
            } else {
                qtd_impar++;
            }

            System.out.print("Enter a number: ");
            num = sc.nextInt();
        }

        if (qtd == 0) {
            System.out.println("No numbers entered.");
        } else {
            System.out.println("Sum: " + soma);
            System.out.println("Quantity: " + qtd);
            media = (double) soma / qtd;
            System.out.println("Average: " + media);
            System.out.println("Largest: " + maior);
            System.out.println("Smallest: " + menor);

            if (qtd_par == 0) {
                System.out.println("No even numbers.");
            } else {
                media_par = (double) soma_par / qtd_par;
                System.out.println("Even numbers average: " + media_par);
            }

            perc = (double) qtd_impar * 100 / qtd;
            System.out.println("Percentage of odd numbers: " + perc + "%");
        }

        sc.close();
    }
}
