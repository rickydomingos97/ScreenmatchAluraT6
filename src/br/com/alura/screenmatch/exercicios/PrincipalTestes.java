package br.com.alura.screenmatch.exercicios;

import java.util.ArrayList;

public class PrincipalTestes {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Jacqueline");
        nomes.add("Paulo");
        nomes.add("Suellen");
        nomes.add("Emily");

    // primeira forma de fazer o loop com for
        System.out.println("---------------");
        for (String nome : nomes) {
            System.out.println(nome);
        }

    // segunda forma de fazer o loop com foreach
        System.out.println("---------------");
        nomes.forEach(nome -> System.out.println(nome));

        // terceira forma de fazer o loop com foreach

        //É possível simplificar ainda mais o exemplo de código anterior,
        // utilizando o recurso conhecido como Method Reference,
        // que nada mais é do que uma forma
        // reduzida de uma expressão lambda:
        System.out.println("---------------");
        nomes.forEach(System.out::println);
    }
}