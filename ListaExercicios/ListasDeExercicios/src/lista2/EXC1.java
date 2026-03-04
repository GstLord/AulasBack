package lista2;

import java.util.Scanner;

public class EXC1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nickname: ");
        String nick = sc.next();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if(idade < 16 ){
            System.out.println("Idade minima para participar é 16 anos!");
        }else System.out.println("Cadastro aprovado!!");

    }

}
