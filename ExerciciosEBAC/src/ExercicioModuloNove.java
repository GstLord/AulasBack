import java.util.Scanner;

public class ExercicioModuloNove {
    public static void main(String[] args) {
        // MEU CODIGO
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


        //------------------------------------------------------------------------------------------------------------------


        //CODIGO DA IA

        int numero;
        int contador = 0;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        while (contador <= 10) {
            int resultado = contador * numero;
            System.out.println(contador + " x " + numero + " = " + resultado);
            contador++;
        }

        int escolha;

        do {
            System.out.println("\nEscolha uma opcao:");
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");

            escolha = sc.nextInt();
            sc.nextLine();

            if (escolha == 1) {
                System.out.println("Digite uma palavra ou uma frase:");
                String frase = sc.nextLine();
                System.out.println("Frase informada:");
                System.out.println(frase);

            } else if (escolha == 2) {
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");

            } else {
                System.out.println("Opcao inválida");
            }

        } while (escolha != 2);

        sc.close();

        //pontos de melhoria
//        Melhorar nomes de variáveis (multi → resultado)
//        Usar contador++ em vez de contador = contador + 1
//        Ajustar formatação da saída da tabuada (espaçamento)
//        Organizar melhor os blocos de código (separação visual entre partes)
//        Usar {} no else para evitar erros futuros
//        Fechar o Scanner com sc.close()
//        (Opcional) Melhorar nomes como palavra → frase para maior clareza
    }
}
