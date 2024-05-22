package br.com.alura.screenmatch.exercicios.animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }



    @Override
    public void correr() {
        System.out.println("o cachorro esta Correndo");
    }

    @Override
    public void falar() {
        System.out.println("o cachorro Late");
    }
}