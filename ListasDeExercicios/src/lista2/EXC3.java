package lista2;

import java.util.Scanner;

public class EXC3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas moedas coletou? ");
        int moedas = sc.nextInt();

        int vidas = moedas / 50;

        if(moedas >= 50) {


            System.out.println("Parabens você ganhou " + vidas + " vidas");
        } else if(moedas < 50) {
            int falta = 50 - moedas;
            System.out.println("Faltam " + falta + " moedas para a proxima vida.");

        }
    }


}
