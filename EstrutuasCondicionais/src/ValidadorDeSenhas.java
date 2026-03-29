import java.util.Objects;
import java.util.Scanner;

//Utilizando Laço While

public class ValidadorDeSenhas{
    //MEU CODIGO
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String SenhaCorreta = "3d2yMUGIWARA";
        String SenhaDigitada;
        int Tentativas = 3;

        while(Tentativas > 0){
            System.out.println("Digite sua senha");
            SenhaDigitada = sc.next();
                //o "!" nega toda a linha usada como parametro.
                // (Objects.equals(Variavel 1, Variavel 2)) compara o valor de duas memorias.
                //somente (Variavel 1 == Variavel 2) compara o endereço das duas variaveis, oq pode causar erros.
            if (!SenhaDigitada.equals("3d2yMUGIWARA")) {
                Tentativas -= 1;
            }else {
                System.out.println("Acesso Liberado!!");
                break;
            }
        }
        if (Tentativas == 0){
            System.out.println("Acesso Bloqueado, tentativas excedidas");
        }

//--------------------------------------------------------------------------------------------------------------------------


        //CODIGO MELHORADO POR IA
        String senhaCorreta = "3d2yMUGIWARA";
        int tentativas = 3;

        while (tentativas > 0) {
            System.out.print("Digite sua senha: ");
            String senhaDigitada = sc.nextLine();

            //apenas uma verificação
            if (Objects.equals(senhaDigitada, senhaCorreta)) {
                System.out.println("Acesso liberado!");
                sc.close();
                return;
            }
            //sintaxe melhorada
            tentativas--;
            System.out.println("Senha incorreta. Tentativas restantes: " + tentativas); //melhoria de experiencia de usuario
        }

        System.out.println("Acesso bloqueado. Tentativas excedidas.");
        sc.close();

    }

}