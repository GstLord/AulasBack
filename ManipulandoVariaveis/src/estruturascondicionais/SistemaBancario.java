package estruturascondicionais;

import java.util.Scanner;



public class SistemaBancario {


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double deposito;
        double saldo = 1000;
        int op1;
        int op2;
        int op3;
        int op4;

        int opcao;
        do {

            System.out.println("\nMenu-Principal\n");
            System.out.println("\n----------------------------------------\n\n");
            System.out.println("Escolha uma das opções: \n");
            System.out.println("1- Consultar Saldo");
            System.out.println("2- Depositar");
            System.out.println("3- Sacar");
            System.out.println("0- Sair");
            opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    do {
                        System.out.println("-----CONSULTA DE SALDO-----\n\n");
                        System.out.println("Seu saldo atual: \n" + saldo);
                        System.out.println("Digite 0 para voltar:");
                        op1 = sc.nextInt();
                    } while (op1 != 0);
                    break;

                case 2:
                    do {
                        System.out.print("-----TELA DE DEPOSITO-----\n\n");
                        System.out.print("Valor a ser depositado: ");
                        deposito = sc.nextDouble();
                        saldo = saldo + deposito;
                        System.out.println("Depósito Finalizado.");
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("\n\n1- Depositar novamente.");
                        System.out.println("0- sair\n");
                        op2 = sc.nextInt();

                        switch (op2) {
                            case 1:
                                System.out.print("Valor a ser depositado: ");
                                deposito = sc.nextDouble();
                                saldo = saldo + deposito;
                                break;


                            case 0:
                                System.out.println("Saindo...");
                                break;
                        }

                    } while (op2 != 0);
                    break;

                case 3:
                    System.out.println("\nDigite o valor a ser sacado(entre 2 e 1000: ");
                    int ValorDeposito = sc.nextInt();

                    saldo = saldo - ValorDeposito;


                    if (ValorDeposito > 2 || ValorDeposito < 1000) {
                        System.out.println("Valor inválido");
                    }

                    int nota = 100;

                    for (int i = 0; i < 6; i++) {
                        int QuantidadeDeCedulas = ValorDeposito / nota;
                        if (QuantidadeDeCedulas != 0) {
                            System.out.println(QuantidadeDeCedulas + " Notas de " + nota);
                        }
                        ValorDeposito = ValorDeposito % nota;

                        if (nota >= 100) {
                            nota = 50;
                        } else if (nota >= 50) {
                            nota = 20;
                        } else if (nota >= 20) {
                            nota = 10;
                        } else if (nota >= 10) {
                            nota = 5;
                        } else if (nota >= 2) {
                            nota = 2;
                        }
                    }
                    break;

                case 0:
                    System.out.println("Volte sempre :)");

                    break;

            }// teste de commit
        } while (opcao != 0);
    }

}
