package estruturascondicionais;

import java.util.Scanner;

public class EstruturasCondicionais {
    //Operadores Relacionais
    //==(igual a), !=(diferente de)
    //&&(e), ||(ou)

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);// importante para receber informações do teclado

//        System.out.println("Digite sua idade");
//        int idade = scanner.nextInt();
//        //if, else, if else
//        if(idade <= 10){
//            System.out.println("É uma criança!");
//
//             }else if(idade >= 12 && idade < 18) {
//
//            System.out.println("É um adolescente!");
//
//            }else if (idade >=18) {
//
//            System.out.println("É maior de idade!");
//
//        }

        //switch case

//        System.out.println("Escolha um numero de 1 a 7: ");
//        int dia = scanner.nextInt();
//              //variavel de parametro (dia)
//        switch (dia){
//            case 1:
//                System.out.println("Domingo");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3:
//                System.out.println("Terça");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                break;
//            case 6:
//                System.out.println("Sexta");
//                break;
//            case 7:
//                System.out.println("Sabado");
//                break;
//            default:
//                System.out.println("Numero invalido, digite um numero de 1 a 7");
//        }

        //comparação com equals

        String palavra = "Sucesso";

        if (palavra.equals("Sucesso")){  //equals é um metodo da função String, que compara dados dentro de variaveis
            System.out.println("É isso meeesmo!!!");
        }else{
            System.out.println("NADA DIISSO!");
        }

        //Condição Ternaria
        System.out.println("Digite SENHA");
        String senha = sc.next();


        String retorno = senha.equals("SENHA") ? "Senha correta!" : "Senha Incorreta";

        System.out.println(retorno);

    }


}
