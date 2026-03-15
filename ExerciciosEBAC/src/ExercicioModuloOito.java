import java.util.Scanner;

public class ExercicioModuloOito {

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);


                System.out.println("Digite seu nome(Se tiver mais de 6 letras seu nome irá se repetir quantas vezes desejar): ");
                String nome = sc.nextLine();

                System.out.println("Digite um Numero Inteiro, se seu nome tiver mais de 6 letras vai se repetir (n) vezes: ");
                int x = sc.nextInt();

                System.out.print("usando Laço FOR: \n");

                System.out.println("De 0 a x em ordem crescente: ");

                if(nome.length() > 6){
                        for(int i = 0; i <= x; i++) {
                                System.out.print( + i + " ");
                        }
                        System.out.print("\n");
                        for(int i = 0; i <= x; i++) {
                                System.out.print(i + "-" + nome + " ");
                        }
                }else {
                        System.out.println("Olá, " + nome + "\n");
                        for(int i = 0; i <= x; i++) {
                                System.out.print( + i + " ");
                        }
                }

                System.out.println("\n\nDe x a 0 em ordem decrescente: \n");

                for(int i = x; i >= 0; i--){
                        System.out.print(i + " ");
                }

        }
}
