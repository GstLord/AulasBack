package lista1;

import java.util.Scanner;

public class EXC1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        float salario = sc.nextFloat();

        double aumento = salario *1.28;
       System.out.println("Seu salario foi para: " + aumento);
    }

}
