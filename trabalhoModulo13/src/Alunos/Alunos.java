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
    }

    public int getNumeroProvas() {
        return numeroProvas;
    }
}
