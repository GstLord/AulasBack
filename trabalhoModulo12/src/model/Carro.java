package model;

public class Carro {
    private String nome;
    private String cor;
    private double valor;
    private String ano;

    public Carro(String nome, String cor, double valor, String ano){
        this.nome = nome;
        this.cor = cor;
        this.valor = valor;
        this.ano = ano;
    }

    public String pegaNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCor: " + cor + "\nValor: " + valor + "\nAno: " + ano;
    }
}
