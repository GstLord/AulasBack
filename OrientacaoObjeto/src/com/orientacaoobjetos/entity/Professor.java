package com.orientacaoobjetos.entity;

public class Professor {
    public String escola = "EBAC";
    public String nome = "Carlos";
    public String materia = "UX";
    public int idade;

    public void lecionarMateria(){
        System.out.println("O professor " + nome + " esta dando a matéria " + materia + " na escola " + escola);
    }

    public void finalizarMateria(){
        System.out.println("O professor " + nome + " finalizou a materia " + materia + " na escola " + escola);

    }

    @Override
    public String toString() {

        return "\nNome: " + nome + "\nescola: " + escola +  "\nmateria: " + materia + "\nidade: " + idade + "\n";
    }
}
