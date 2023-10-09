package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Digite o horário nesse formato(0,00): ");
		 double horario = sc.nextDouble();
		
		 int hora = (int)Math.floor(horario);
		 double minuto = Math.round((horario - hora)*100);
		 int hora_conv = (int)((hora*60) + minuto);
		 
		 System.out.print("O total de minutos é " + hora_conv);
		 
		 sc.close();
	}

}
