package br.com.alura.screenmatch.exercicios.animal;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("pluto", 5);
        cachorro.correr();
        cachorro.falar();
        System.out.println("O nome do cachorro é: " + cachorro.getNome());

        Animal animal = (Animal )cachorro;
        animal.setNome("Cacau");
        animal.falar();
        animal.correr();
        System.out.println("O nome do animal é: " + animal.getNome());
        System.out.println("O nome do cachorro é: " + cachorro.getNome());

        Cachorro dog = new Cachorro("Nina", 3);
        if ( dog instanceof Animal && animal.getPeso() < 5 ) {
            System.out.println("Cachorro chamado  " + dog.getNome() + " e um animal");
        } else {
            System.out.println("O objeto não é do tipo Animal grande .");
        }
    }
}