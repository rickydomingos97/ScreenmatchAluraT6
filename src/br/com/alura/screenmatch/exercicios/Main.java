package br.com.alura.screenmatch.exercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("Apple");
        listaDeStrings.add("Samsung");
        listaDeStrings.add("Xiaomi");
        listaDeStrings.add("Sony");
        listaDeStrings.add("LG");

        // percorrendo o arraylist com um forEach
        for ( String elemento : listaDeStrings ) {
            System.out.println(elemento);
        }
    }
}