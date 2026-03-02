package conversoesentretipos;

public class ConversoesEntreTipos {

    public static void main(String[] args) {

        int numeroInt = 5;
        double numeroDouble = numeroInt;

        System.out.println(numeroInt);
        System.out.println(numeroDouble);

        int outroNumeroInt = (int)numeroDouble; //cria um casting para transformar um tipo double em tipo inteiro

        String tipoString =String.valueOf(10); //converter tipos Inteiros para String

        int tipoInt = Integer.parseInt("150"); //converte tipos Strings para Inteiro

        System.out.println(tipoString);
        System.out.println(tipoInt);

        Integer number = 10;
        int length = number.toString().length(); //converte a variavel para tipo String

        System.out.println(number);

    }
}
