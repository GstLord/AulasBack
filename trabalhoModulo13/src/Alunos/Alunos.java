package Alunos;

public class Alunos {

    private String nome;
    private String turma;
    private int[] nota;
    private int numeroProvas;

    public Alunos(String nome, String turma, int numeroProvas) {
        this.nome = nome;
        this.turma = turma;
        this.numeroProvas = numeroProvas;
        this.nota = new int[numeroProvas];
    }

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

    public int getNota(int indice) {
        return nota[indice];
    }

    public boolean setNota(int indice, int valor) {
        if (valor < 0 || valor > 10) {
            return false;
        }
        this.nota[indice] = valor;
        return true;
    }

    public double calcularMedia() {
        int soma = 0;
        for (int i = 0; i < numeroProvas; i++) {
            soma += nota[i];
        }
        return (double) soma / numeroProvas;
    }

    @Override
    public String toString() {
        StringBuilder notas = new StringBuilder();
        for (int i = 0; i < numeroProvas; i++) {
            notas.append(nota[i]);
            if (i < numeroProvas - 1) {
                notas.append(", ");
            }
        }
        return "Aluno: " + nome + " | Turma: " + turma +
                " | Notas: [" + notas + "]" +
                " | Media: " + String.format("%.2f", calcularMedia());
    }
}
