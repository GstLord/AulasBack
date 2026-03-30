package matrizesvetores;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanhoDoVetor = sc.nextInt();
        int vetorDoUsuario[] = new int[tamanhoDoVetor];

        for (int i = 0; i<tamanhoDoVetor; i++){
            System.out.println("Digite o valor da posição " + i + " do seu vetor: " );
            vetorDoUsuario[i] = sc.nextInt();
        }
        //Exibição dos valores:
        exibeVetor(vetorDoUsuario);

        //-----------------------------------------------------------------------------------------------------------//

        System.out.println("Digite um valor que multiplicará cada posição do vetor: ");
        int valorAMultiplicar = sc.nextInt();
        for(int i = 0; i< vetorDoUsuario.length; i++){
            vetorDoUsuario[i] = vetorDoUsuario[i] * valorAMultiplicar;
        }


        //Exibição dos valores:
        exibeVetor(vetorDoUsuario);

        sc.close();
    }
        //Criação de Metodo//
    private static void exibeVetor(int... vetorDoUsuario){
        System.out.println("Veja");
        for(int i = 0; i< vetorDoUsuario.length; i++){
            System.out.println(vetorDoUsuario[i]);
        }
    }
}
