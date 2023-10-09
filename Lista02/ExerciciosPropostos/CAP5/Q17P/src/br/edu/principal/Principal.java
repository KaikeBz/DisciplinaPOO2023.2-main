package br.edu.principal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        int op, totalPeople = 0;
        int people4 = 0, people5 = 0, people7 = 0, people12 = 0;
        
        do {
            op = showMenu(sc);
            
            if (op == 4 || op == 5 || op == 7 || op == 12) {
                System.out.print("Insert here how many people were watching: ");
                int viewers = sc.nextInt();
                
                switch (op) {
                    case 4:
                        people4 += viewers;
                        break;
                    case 5:
                        people5 += viewers;
                        break;
                    case 7:
                        people7 += viewers;
                        break;
                    case 12:
                        people12 += viewers;
                        break;
                }
                
                totalPeople += viewers;
            } else if (op != 0) {
                System.out.println("Invalid channel selection.");
            }
        } while (op != 0);
        
        sc.close();
        
        double perc4 = (double) people4 * 100 / totalPeople;
        double perc5 = (double) people5 * 100 / totalPeople;
        double perc7 = (double) people7 * 100 / totalPeople;
        double perc12 = (double) people12 * 100 / totalPeople;
        
        System.out.println("There are " + df.format(perc4) + "% watching Channel 4");
        System.out.println("There are " + df.format(perc5) + "% watching Channel 5");
        System.out.println("There are " + df.format(perc7) + "% watching Channel 7");
        System.out.println("There are " + df.format(perc12) + "% watching Channel 12");
        System.out.println("See you soon!");
    }
    
    public static int showMenu(Scanner sc) {
        System.out.println("-- MENU --");
        System.out.println("Choose your channel : ");
        System.out.println("--  [4] --");
        System.out.println("--  [5] --");
        System.out.println("--  [7] --");
        System.out.println("--  [12]--");
        System.out.println("[0] END --");
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
