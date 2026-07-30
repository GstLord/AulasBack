package com.orientacaoobjetos.entity;


public class Professor {
    private String escola = "EBAC";
    private String nome = "Carlos";
    private String materia = "UX";
    private int idade;

    //ISSO AQUI É UM CONSTRUTOR
    public Professor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.escola = escola;
        this.materia = materia;

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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {

        return "\nNome: " + nome + "\nescola: " + escola +  "\nmateria: " + materia + "\nidade: " + idade + "\n";
    }
}
