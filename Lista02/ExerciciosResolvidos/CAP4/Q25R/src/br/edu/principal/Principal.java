package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insert here an integer angle : ");
		int angle = sc.nextInt();
		sc.close();
		int laps ;
		if(angle>360 || angle<-360) {
			laps =  (int) Math.ceil(angle/360);
			angle %= 360; 
		} else {
			laps=0;
		}
		if(angle == 0 || angle == 90 || angle ==180 ||angle ==270 || angle ==360 ||angle == -90 ||angle == -180 ||angle == -270 || angle == -360 ) {
			System.out.println("It's on top of some axis ");
		}
		if((angle > 0 && angle <90) || (angle < -270 && angle > -360)) {
			System.out.println("First quadrant");
		}
		else if((angle > 90 && angle <180) || (angle < -180 && angle > -270)) {
			System.out.println("Second quadrant");
		}
		else if((angle > 180 && angle <270) || (angle < -90 && angle > -180)) {
			System.out.println("Third quadrant");
		}
		else if((angle > 270 && angle <360) || (angle < 0 && angle > -90)) {
			System.out.println("Fourth quadrant");
		}
		System.out.printf( laps + " laps in ");
		if(angle<0) {
			System.out.println("clockwise");
		}else {
			System.out.println("anticlockwise");
		}
	}
	
}
