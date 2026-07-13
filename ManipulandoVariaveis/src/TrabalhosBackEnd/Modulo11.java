package TrabalhosBackEnd;

import java.util.Scanner;

public class Modulo11 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.println("Digite um numero inteiro: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
