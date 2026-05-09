import java.util.Scanner;

public class ExercicioModuloDez {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Defina o tamanho do Vetor");
        int tamanhoVet = sc.nextInt();

        int [] vetor = new int [tamanhoVet];

        for( int i=0; i < tamanhoVet; i++ ){
            System.out.println("Digite o valor a ocupar a posição " + (i + 1) + " do vetor");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Vetor Obtido: ");

        exibeVetor(vetor);

        System.out.println("\nVetor Odernado: ");

        ordenaVetor(vetor);

        exibeVetor(vetor);

    }
        //    77  66  33  24  64  23
        //    i    j

    private static void ordenaVetor(int ... vetUsuario){
        for(int i = 0; i < vetUsuario.length; i++){
            for(int j = 0; j < vetUsuario.length; j++ ){
                if(vetUsuario[i] < vetUsuario[j]){
                    int aux = vetUsuario[j];
                    vetUsuario[j] = vetUsuario[i];
                    vetUsuario[i] = aux;
                }
            }
        }
    }

    private static void exibeVetor(int ... vetUsuario){
        for(int i = 0; i < vetUsuario.length; i++){
            System.out.print(vetUsuario[i] + " ");
        }
    }
}
