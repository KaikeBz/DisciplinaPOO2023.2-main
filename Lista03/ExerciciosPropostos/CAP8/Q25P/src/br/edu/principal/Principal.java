package br.edu.principal;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentNumbers = new int[10];
        double[][] studentGrades = new double[10][4];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the student number for student " + (i + 1) + ": ");
            studentNumbers[i] = sc.nextInt();

            System.out.println("Enter the grades for student " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                System.out.print("Grade " + (j + 1) + ": ");
                studentGrades[i][j] = sc.nextDouble();
            }
        }

        double overallAverage = calculateArithmeticAverage(studentGrades);
        System.out.println("The arithmetic average of all students is: " + overallAverage);

        System.out.println("Students who need remediation (average < 6):");
        for (int i = 0; i < 10; i++) {
            double studentAverage = calculateArithmeticAverageStudent(studentGrades[i]);
            if (studentAverage < 6) {
                System.out.println("Student " + studentNumbers[i] + " - Average: " + studentAverage);
            }
        }

        sc.close();
    }

    public static double calculateArithmeticAverageStudent(double[] grades) {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }
    
    public static double calculateArithmeticAverage(double[][] grades) {
        double sum = 0;
        int totalGrades = 0;
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
                totalGrades++;
            }
        }
        return sum / totalGrades;
    }
}

