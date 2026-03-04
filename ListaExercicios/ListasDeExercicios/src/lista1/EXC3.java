package lista1;

import java.util.Scanner;

public class EXC3 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a base do triangulo: ");
        float b = sc.nextFloat();

        System.out.println("Informe a altura do triangulo: ");
        float a = sc.nextFloat();

        float area = (a * b)/2;

        System.out.println("A area do triangulo é: " + area);


    }

}
