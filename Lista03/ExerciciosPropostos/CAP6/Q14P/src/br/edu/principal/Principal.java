package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[6];
        double[] grades1 = new double[6];
        double[] grades2 = new double[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter the first grade for " + names[i] + ": ");
            grades1[i] = sc.nextDouble();

            System.out.print("Enter the second grade for " + names[i] + ": ");
            grades2[i] = sc.nextDouble();

            sc.nextLine(); // Clear the keyboard buffer
        }

        System.out.println("\nGrades Report:");
        System.out.println("ALUNO 1a 2a MÉDIA SITUAÇÃO");

        double classAverage = 0;
        int studentsPassed = 0;
        int studentsFailed = 0;
        int studentsExam = 0;

        for (int i = 0; i < 6; i++) {
            double average = (grades1[i] + grades2[i]) / 2;
            classAverage += average;

            String situation;
            if (average >= 7.0) {
                situation = "Aprovado";
                studentsPassed++;
            } else if (average >= 4.0) {
                situation = "Exame";
                studentsExam++;
            } else {
                situation = "Reprovado";
                studentsFailed++;
            }

            System.out.println(names[i] + " " + grades1[i] + " " + grades2[i] + " " + average + " " + situation);
        }

        classAverage /= 6;
        double percentPassed = (double) studentsPassed / 6 * 100;
        double percentExam = (double) studentsExam / 6 * 100;
        double percentFailed = (double) studentsFailed / 6 * 100;

        System.out.println("\nClass Average = " + classAverage);
        System.out.println("Percent Passed = " + percentPassed + "%");
        System.out.println("Percent Exam = " + percentExam + "%");
        System.out.println("Percent Failed = " + percentFailed + "%");

        sc.close();
    }
}
