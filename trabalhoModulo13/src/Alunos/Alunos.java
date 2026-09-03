package Alunos;

public class Alunos {

    private String nome;
    private String turma;
    private int[] notas;
    private int numeroProvas;

    public Alunos(String nome, String turma, int numeroProvas) {
        this.nome = nome;
        this.turma = turma;
        this.numeroProvas = numeroProvas;
        this.notas = new int[numeroProvas];
    }

    // Getters e Setters (padrão POJO)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getNumeroProvas() {
        return numeroProvas;
    }

    public int[] getNotas() {
        return notas;
    }

    public boolean setNota(int indice, int nota) {
        if (nota < 0 || nota > 10) {
            return false;
        }
        this.notas[indice] = nota;
        return true;
    }

    /**
     * Calcula a média das notas: soma de todas as notas dividido
     * pela quantidade de provas.
     */
    public double calcularMedia() {
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return (double) soma / numeroProvas;
    }
}