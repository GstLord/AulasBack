package com.orientacaoobjetos.entity;

public class Pessoa {
    private String nome;
    private int idade;


    //ISSO É UM GETTER, PARA ACESSAR DADOS PRIVADOS DA CLASSE
    public Pessoa(String nome, int idade) {
        this.nome = nome;   //this é como se o  parâmetro nome estivesse recebendo a si mesmo como um atributo da classe
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome='" + nome + '\'' + ", idade=" + idade + '}';
    }
}
