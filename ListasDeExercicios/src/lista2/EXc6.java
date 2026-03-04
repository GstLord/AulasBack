import java.util.Scanner;

public class EXc6 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura de um cilindro: ");
        double h  = sc.nextDouble();

        System.out.println("Digite o raio da base do cilindro: ");
        double r = sc.nextDouble();

        double volume = 3.14 * r * r * h;

        System.out.println("O volume do cilindro é: " + volume);

    }

}
