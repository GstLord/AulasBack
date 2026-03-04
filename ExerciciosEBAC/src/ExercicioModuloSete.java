import java.util.Scanner;

public class ExercicioModuloSete {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int x = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int y = sc.nextInt();

        if(x > y){
            System.out.println("O maior numero é: " + x);
        } else if (x == y) {
            System.out.println("Os numeros são iguais");
        }else System.out.println("O maior numero é: " + y);

    }

}
