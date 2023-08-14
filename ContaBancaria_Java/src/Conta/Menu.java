package Conta;

import Conta.model.Conta;
import Conta.util.Cores;

import Conta.model.ContaCorrente;
import Conta.model.ContaPoupança;
import java.util.Scanner;

public class Menu {
    public static void main (String[]args){





        Scanner leia = new Scanner(System.in);
        int op;

        while(true){
            System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "************************************");
            System.out.println();
            System.out.println("\t\t\tBANCO DO BRAzIL");
            System.out.println();
            System.out.println("************************************");
            System.out.println();
            System.out.println("\t\t\t1- Criar Conta ");
            System.out.println("\t\t\t2- Listar todas as Contas ");
            System.out.println("\t\t\t3- Buscar conta por Número");
            System.out.println("\t\t\t4- Atualizar dados da Conta ");
            System.out.println("\t\t\t5- Apagar conta ");
            System.out.println("\t\t\t6- Sacar ");
            System.out.println("\t\t\t7- Depositar ");
            System.out.println("\t\t\t8- Transferir valores entre contas ");
            System.out.println("\t\t\t9- Sair");
            System.out.println();
            System.out.println("************************************");
            System.out.println("Entre com uma opção: ");
            op = leia.nextInt();


            if (op == 9){
                System.out.println(Cores.TEXT_WHITE_BOLD+"\nBanco do Brazil - A gente faz acontecer");
                leia.close();
                System.exit(0);
            }
            switch (op){
                case 1:
                    System.out.println(Cores.TEXT_WHITE_BOLD+"Criar Conta\n\n");
                    break;
                case 2:
                    System.out.println(Cores.TEXT_WHITE_BOLD+"Listar todas as Contas\n\n");
                    break;
                case 3:
                    System.out.println(Cores.TEXT_WHITE_BOLD+"Consultar dados da Conta - por número\n\n");
                    break;
                case 4:
                    System.out.println(Cores.TEXT_WHITE_BOLD+"Atualizar dados da Conta\n\n");
                    break;
                case 5:
                    System.out.println(Cores.TEXT_WHITE_BOLD+"Apagar a Conta\n\n");
                    break;
                case 6:
                    System.out.println(Cores.TEXT_WHITE_BOLD+"Saque\n\n");
                    break;
                case 7:
                    System.out.println(Cores.TEXT_WHITE_BOLD+"Deposito\n\n");
                    break;
                case 8:
                    System.out.println(Cores.TEXT_WHITE_BOLD+"Transferência entre Contas\n\n");
                    break;
                default:
                    System.out.println(Cores.TEXT_RED_BOLD+"\nOpção inválida!");
                    break;
            }




        }
    }
}
