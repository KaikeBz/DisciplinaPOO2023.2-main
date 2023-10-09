package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	      System.out.print("Digite a medida do ângulo (em graus): ");
	       double anguloGraus = sc.nextDouble();

	      System.out.print("Digite a altura da parede: ");
	      double alturaParede = sc.nextDouble();

	      double anguloRadianos = Math.toRadians(anguloGraus);

	      double medidaEscada = alturaParede / Math.sin(anguloRadianos);
	       
	      System.out.println("A medida da escada é: " + medidaEscada);
	       
	      sc.close();
	}

}
