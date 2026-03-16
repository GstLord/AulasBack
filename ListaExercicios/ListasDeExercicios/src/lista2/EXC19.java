package lista2;

import java.util.Scanner;

public class EXC19 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua Pressão Arterial Diástolica (PAD)");
        double pad = sc.nextDouble();

        System.out.println("Informe sua Pressão Arterial Sistólica(PAS)");
        double pas = sc.nextDouble();

        //Meu codigo

        if (pad < 85 && pas < 130){
            System.out.println("Pressão arterial normal");
        } else if ((pad >= 85 && pad <= 89) || (pas >= 130 && pas <= 139)) {
            System.out.println("Pressão arterial normal limítrofe");
        }else if ((pad >= 90 && pad <= 99) || (pas >= 140 && pas <= 159)){
            System.out.println("Hípertensão leve(Estágio 1");
        }else if ((pad >= 100 && pad <= 109) || (pas >= 160 && pas <= 179)){
            System.out.println("Hípertensão moderada(Estágio 2)");
        }else if (pad >= 110 && pas >= 180){
            System.out.println("Hípertensão grave(Estágio 3)");
        } else if (pad < 90 && pas >= 140) {
            System.out.println("Hípertensão sistólica isolada");
        }


            //IA codigo

        if (pad >= 110 || pas >= 180) {
            System.out.println("Hipertensão grave (Estágio 3)");
        }
        else if (pad >= 100 || pas >= 160) {
            System.out.println("Hipertensão moderada (Estágio 2)");
        }
        else if (pad >= 90 || pas >= 140) {
            System.out.println("Hipertensão leve (Estágio 1)");
        }
        else if (pad >= 85 || pas >= 130) {
            System.out.println("Pressão arterial normal limítrofe");
        }
        else {
            System.out.println("Pressão arterial normal");
        }

        sc.close();
    }

}
