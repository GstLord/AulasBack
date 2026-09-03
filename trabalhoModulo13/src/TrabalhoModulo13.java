import Alunos.Alunos;

import java.util.Scanner;

public class TrabalhoModulo13 {
    /*
    Crie o objeto Aluno, com atributos e métodos de sua preferência.

    Crie um vetor "nota" de n posições, representando a quantidade de provas que os alunos fizeram no ano.

    Permita que um usuário crie n Alunos e digite os valores das notas que cada aluno tirou durante o ano.

    Ao final, exiba os dados de cada aluno e as médias de cada um. As médias representam a soma das notas dividido pela quantidade de notas.

    Crie cada aluno com parâmetros de construtores de sua escolha. O objeto aluno deve seguir os padrões de modificadores de acesso vistos no módulo para a construção de um POJO.

    Não permita que um aluno tenha uma nota menor do que zero ou maior do que 10. Informe o usuário que ele digitou uma nota inválida e precisa repreencher a nota em caso de invalidez.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidadeAlunos = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer do Scanner

        Alunos[] alunos = new Alunos[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("\n--- Cadastro do Aluno " + (i + 1) + " ---");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Turma: ");
            String turma = scanner.nextLine();

            System.out.print("Quantas provas o aluno fez no ano? ");
            int numeroProvas = scanner.nextInt();

            Alunos aluno = new Alunos(nome, turma, numeroProvas);

            for (int j = 0; j < numeroProvas; j++) {
                boolean notaValida = false;
                while (!notaValida) {
                    System.out.print("Nota da prova " + (j + 1) + ": ");
                    int nota = scanner.nextInt();
                    notaValida = aluno.setNota(j, nota);
                    if (!notaValida) {
                        System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                    }
                }
            }
            scanner.nextLine(); // limpa o buffer antes do próximo aluno

            alunos[i] = aluno;
        }

        System.out.println("\n===== RESULTADOS FINAIS =====");
        for (Alunos aluno : alunos) {
            System.out.println("\nAluno: " + aluno.getNome());
            System.out.println("Turma: " + aluno.getTurma());

            System.out.print("Notas: ");
            for (int nota : aluno.getNotas()) {
                System.out.print(nota + " ");
            }
            System.out.println();

            System.out.printf("Média: %.2f%n", aluno.calcularMedia());
        }

        scanner.close();
    }
}