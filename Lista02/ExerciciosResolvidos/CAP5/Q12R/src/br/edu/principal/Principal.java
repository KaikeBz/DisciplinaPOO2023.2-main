package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_op, num_maior = 0, cont_m = 0, cont_f = 0, tot_pecas = 0;
        double salario_maior = 0, media_m = 0, media_f = 0, tot_folha = 0;
        String sexo_op;

        for (int cont = 1; cont <= 15; cont++) {
            System.out.println("Digite o número do " + cont + "º operário:");
            num_op = scanner.nextInt();
            System.out.println("Digite o sexo do operário (M ou F):");
            sexo_op = scanner.next();
            System.out.println("Digite o total de peças fabricadas pelo " + cont + "º operário:");
            int pecas_op = scanner.nextInt();

            double salario_op = 0;

            if (pecas_op <= 30) {
                salario_op = 450;
            } else if (pecas_op <= 50) {
                salario_op = 450 + ((pecas_op - 30) * 3 / 100 * 450);
            } else {
                salario_op = 450 + ((pecas_op - 30) * 5 / 100 * 450);
            }

            System.out.println("O operário de número " + num_op + " recebe salário = " + salario_op);

            tot_folha += salario_op;
            tot_pecas += pecas_op;

            if (sexo_op.equals("M")) {
                media_m += pecas_op;
                cont_m++;
            } else {
                media_f += pecas_op;
                cont_f++;
            }

            if (cont == 1) {
                salario_maior = salario_op;
                num_maior = num_op;
            } else {
                if (salario_op > salario_maior) {
                    salario_maior = salario_op;
                    num_maior = num_op;
                }
            }
        }

        media_m /= cont_m;
        media_f /= cont_f;

        System.out.println("Total da folha de pagamento: " + tot_folha);
        System.out.println("Total de peças fabricadas por todos os operários: " + tot_pecas);
        System.out.println("Média de peças fabricadas por operários do sexo masculino: " + media_m);
        System.out.println("Média de peças fabricadas por operários do sexo feminino: " + media_f);
        System.out.println("Número do operário com maior salário: " + num_maior);

        scanner.close();
    }
}

