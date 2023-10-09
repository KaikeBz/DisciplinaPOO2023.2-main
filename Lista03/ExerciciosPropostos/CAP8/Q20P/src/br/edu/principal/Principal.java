package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        calculateStatistics();
    }

    public static void calculateStatistics() {
        Scanner sc = new Scanner(System.in);

        double totalSalaries = 0;
        double highestSalary = 0;
        int totalPeople = 0;
        int totalChildren = 0;
        int peopleBelow380Salary = 0;

        System.out.println("Enter data for residents (salary and number of children).");
        System.out.println("To finish, enter a negative salary.");

        while (true) {
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            
            if (salary < 0) {
                break; 
            }

            System.out.print("Number of children: ");
            int numChildren = sc.nextInt();

            totalSalaries += salary;
            totalPeople++;
            totalChildren += numChildren;

            if (salary > highestSalary) {
                highestSalary = salary;
            }

            if (salary < 380.00) {
                peopleBelow380Salary++;
            }
        }

        sc.close();

        double averageSalary = totalSalaries / totalPeople;
        double averageChildren = (double) totalChildren / totalPeople;
        double percentBelow380Salary = (double) peopleBelow380Salary / totalPeople * 100;

        System.out.println("Average salary of the population: " + averageSalary);
        System.out.println("Average number of children: " + averageChildren);
        System.out.println("Highest salary: " + highestSalary);
        System.out.println("Percentage of people with salary below $380.00: " + percentBelow380Salary + "%");
    }
}
