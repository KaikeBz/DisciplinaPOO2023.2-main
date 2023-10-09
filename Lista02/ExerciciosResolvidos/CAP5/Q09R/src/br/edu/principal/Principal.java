package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		double n1 ,ta=0,tr=0,te=0,n2,media,mediaClass,totalClass = 0;
		
		for(int cont = 1; cont<=6;cont++) {
			System.out.printf("Student " + cont +  " insert here your first grade : ");
			n1 = sc.nextDouble();
			System.out.printf("Insert here your second grade : ");
			n2 = sc.nextDouble();
			media = (n1+n2)/2;
			System.out.println("Media of student " + cont + " is " + media);
			if(media<=3) {
				tr+=1;
				System.out.println("Reproved");
			}
			else if(media > 3 && media <7) {
				te+=1;
				System.out.println("Exam");
			}else if(media>=7){
				ta+=1;
				System.out.println("Aproved");
			}
			totalClass += media;
		}
		sc.close();
		System.out.println("Studens reproved : " + tr);
		System.out.println("Studens that will do the exam : " + te);
		System.out.println("Studens aproved : " + ta);
		mediaClass = totalClass/6;
		System.out.println("The media of the class is : " + df.format(mediaClass));
	}

}
