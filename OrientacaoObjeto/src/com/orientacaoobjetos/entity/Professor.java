package com.orientacaoobjetos.entity;

public class Professor {
    private String escola = "EBAC";
    private String nome = "Carlos";
    private String materia = "UX";
    private int idade;

    public Professor(String nome, int idade, String escola, String materia){
        this.nome = nome;
        this.idade = idade;
        this.escola = escola;
        this.materia = materia;
        validarIdade();
    }

    private void validarIdade(int idade) {
        if(idade < 18){
            System.out.println("A idade " + idade + " é inválida!");
        }
    }

    public void lecionarMateria(){
        System.out.println("O professor " + nome + " esta dando a matéria " + materia + " na escola " + escola);
    }

    public void finalizarMateria(){
        System.out.println("O professor " + nome + " finalizou a materia " + materia + " na escola " + escola);

    }


    public String getEscola(){
        return escola;
    }

    public void setEscola(String escola){
        this.escola = escola;
    }


    @Override
    public String toString() {

        return "\nNome: " + nome + "\nescola: " + escola +  "\nmateria: " + materia + "\nidade: " + idade + "\n";
    }
}
