package matrizesvetores;

import java.util.Scanner;

public class OrdenandoVetores {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho do vetor?");
        int tamanhoVetor = sc.nextInt();


        int [] vetorInteiros = new int[tamanhoVetor];

        for(int i = 0; i < tamanhoVetor; i++){
            System.out.println("Digite o valor da " + (i + 1) + "° do vetor:");
            vetorInteiros[i] = sc.nextInt();
        }

        exibeVetor(vetorInteiros);
        ordenaVetor(vetorInteiros);
        System.out.println("\n");
        exibeVetor(vetorInteiros);
    }

    private static void exibeVetor(int[] vetor){

        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }

    private static void ordenaVetor(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            for (int j = i; j < vetor.length; j++){

                if(vetor[j] < vetor[i]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }
    private static void ordenaVetorString(String[] vetor){

        for(int i = 0; i < vetor.length; i++) {
            for (int j = i; j < vetor.length; j++) {
                if(vetor[j].compareTo(vetor[i]) < 0){
                    String aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }

}
