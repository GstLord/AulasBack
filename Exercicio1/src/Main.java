import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Olá!!");

        System.out.println("Digite seu nome completo: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade= scanner.nextInt();

        System.out.println("Digite seu peso: ");
        float peso= scanner.nextFloat();

        System.out.println("Digite sua altura: ");
        float altura= scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Digite seu estado civil: ");
        String estado_civil = scanner.nextLine();

        scanner.close();

        System.out.println("Olá, "+nome);
        System.out.println("Seu CPF: "+cpf);
        System.out.println("Sua idade: "+idade);
        System.out.println("Seu peso: "+peso);
        System.out.println("Sua altura: "+altura);
        System.out.println("Seu estado civil: "+estado_civil);

    }
}