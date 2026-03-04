package lista1;

import java.util.Scanner;

public class EXC5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Raio do circulo: ");
        double r = sc.nextDouble();

        double d = 2 * r;
        double p = 3.1416 * d;

        System.out.println("O perimetro do circulo é: " + p);

    }
}
