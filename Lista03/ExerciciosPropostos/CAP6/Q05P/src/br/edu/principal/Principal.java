package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] logicCourseEnrollments = new int[15];
        int[] programmingLanguageEnrollments = new int[10];

        for (int i = 0; i < 15; i++) {
            System.out.print("Enter the student's enrollment number for Logic course: ");
            logicCourseEnrollments[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the student's enrollment number for Programming Language course: ");
            programmingLanguageEnrollments[i] = sc.nextInt();
        }

        System.out.println("Students taking both courses:");

        for (int logicEnrollment : logicCourseEnrollments) {
            for (int programmingEnrollment : programmingLanguageEnrollments) {
                if (logicEnrollment == programmingEnrollment) {
                    System.out.println("Enrollment: " + logicEnrollment);
                }
            }
        }

        sc.close();
    }
}
