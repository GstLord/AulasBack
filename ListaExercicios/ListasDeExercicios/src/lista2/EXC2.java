package lista2;

import java.util.Scanner;

public class EXC2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua pontuação: ");
        int pontos = sc.nextInt();

        int record = 1000 - pontos;

        if(pontos <= 1000){
            System.out.println("Por pouco, faltou apenas: " + record);
        }else System.out.println("PARABENS!! Voce bateu o record");

    }

}
