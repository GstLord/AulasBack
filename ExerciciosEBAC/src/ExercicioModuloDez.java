import java.util.Scanner;

public class ExercicioModuloDez {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

//-------------------------CRIAÇÃO DO VETOR EXERCICIO1--------------------------------------
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
        System.out.println("\n");
        sc.nextLine();
//--------------------------ALTERAÇÃO DO VETOR EXERCICIO2---------------------------------------
        for( int i=0; i < tamanhoVet; i++ ){
           if(vetor[i] %2 == 0){
               vetor[i] = vetor[i]*2;
           }else {
               vetor [i] = vetor[i]*vetor[i];
           }
        }
        System.out.println("Vetor Alterado");
        exibeVetor(vetor);

//-------------------------CONTADOR DE VOGAIS EXERCICIO1-------------------------------------------
        System.out.println("\n");
        System.out.println("Digite um nome:");
        String nome = sc.nextLine();

        System.out.print("O nome " +  nome + " tem ");

        int qtdVogais = 0;

        for (int i=0; i<nome.length(); i++){
            char letra = Character.toLowerCase(nome.charAt(i));

            if(letra == 'a'|| letra =='e'|| letra =='i'|| letra =='o'|| letra =='u'){
                qtdVogais ++;
            }
        }
        System.out.println(qtdVogais + " vogais");

//-----------------------------EXIBINDO O NOME INVERTIDO EXERCICIO3-----------------------------
        int i = 0;
        System.out.println("Nome informado invertido");
        for ( i = nome.length()-1; i>=0; i--){
            char letra = nome.charAt(i);
            System.out.print(letra);
        }

    }


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
