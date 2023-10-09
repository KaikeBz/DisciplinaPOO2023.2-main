package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int op;

        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;
		do {  
		op = showMenu(sc);
		if (op < 0) {
            System.out.println("Valor negativo. Por favor, insira um valor positivo.");
            continue; 
	    }

        if (op > 0) {
            if (op > maiorValor) {
                maiorValor = op;
            }
            if (op < menorValor) {
                menorValor = op;
            }
		}
        }while(op !=0);
		  if (maiorValor != Integer.MIN_VALUE && menorValor != Integer.MAX_VALUE) {
	            System.out.println("Maior valor inserido: " + maiorValor);
	            System.out.println("Menor valor inserido: " + menorValor);
	        } else {
	            System.out.println("Nenhum valor válido foi inserido.");
	        }
		sc.close();
	}
	 public static int showMenu(Scanner sc) {
	        System.out.println("-- MENU --");
	        System.out.printf("Insert a positive number (or 0 to finish) : ");

	        return getInt(sc);
	    }
	    
	    public static int getInt(Scanner sc) {
	        while (!sc.hasNextInt()) {
	            System.out.println("Invalid input, please try again : ");
	            sc.next();
	        }
	        return sc.nextInt();
	    }
}
