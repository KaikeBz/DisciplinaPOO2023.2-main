package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont, cod, num_vei, num_acid, maior = 0, cid_maior = 0, menor = 0	, cid_menor = 0, soma_vei = 0, soma_acid = 0, cont_acid = 0;
        double media_vei, media_acid;

        for (cont = 1; cont <= 5; cont++) {
            System.out.println("Enter the city code, number of vehicles, and number of accidents for city #" + cont + ":");
            cod = sc.nextInt();
            num_vei = sc.nextInt();
            num_acid = sc.nextInt();

            if (cont == 1) {
                maior = num_acid;
                cid_maior = cod;
                menor = num_acid;
                cid_menor = cod;
            } else {
                if (num_acid > maior) {
                    maior = num_acid;
                    cid_maior = cod;
                }
                if (num_acid < menor) {
                    menor = num_acid;
                    cid_menor = cod;
                }
            }

            soma_vei += num_vei;

            if (num_vei < 2000) {
                soma_acid += num_acid;
                cont_acid++;
            }
        }
        sc.close();

        System.out.println("City with the most accidents: " + cid_maior);
        System.out.println("City with the fewest accidents: " + cid_menor);

        media_vei = (double) soma_vei / 5;
        System.out.println("Average number of vehicles: " + media_vei);

        if (cont_acid == 0) {
            System.out.println("No city had fewer than 2000 vehicles.");
        } else {
            media_acid = (double) soma_acid / cont_acid;
            System.out.println("Average number of accidents in cities with fewer than 2000 vehicles: " + media_acid);
        }

       
    }
}
