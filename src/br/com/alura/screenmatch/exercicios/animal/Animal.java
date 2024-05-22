package br.com.alura.screenmatch.exercicios.animal;

public class Animal {
    private String nome;
    private double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void correr() {
        System.out.println("Correndo");
    }
    public void falar() {
        System.out.println("Som");
    }
}