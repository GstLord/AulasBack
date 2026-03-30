import java.util.Scanner;

public class ExercicioModuloNove {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int multi;
        int numero;
        int contador = 0;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();


        while(contador <= 10){
            multi = contador * numero;
            System.out.println(contador + "x" +numero + "=" + multi);
            contador = contador + 1;
        }
        int escolha;
        do {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Continuar.");
            System.out.println("2 - Sair.");
            escolha = sc.nextInt();
            sc.nextLine();

            if (escolha == 1) {
                System.out.println("Digite uma palavra ou uma frase");
                String palavra = sc.nextLine();
                System.out.println("Frase/Palavra informada:");
                System.out.println(palavra);
            } else if (escolha == 2) {
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
            } else System.out.println("Opcao inválida");
        } while (escolha != 2);
    }
}
