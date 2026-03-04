package lista1;

import java.util.Scanner;

public class EXC4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        double r = sc.nextDouble();

        double a = r * r * 3.1416;

        System.out.println("A area do circulo é: " + a);
    }
}
