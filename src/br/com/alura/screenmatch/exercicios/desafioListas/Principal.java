package br.com.alura.screenmatch.exercicios.desafioListas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.screenmatch.modelos.Titulo;

public class Principal {
  public static void main(String[] args) {
    // criando a lista de numeros:

    ArrayList<Integer> numeros = new ArrayList<>();
    numeros.add(3);
    numeros.add(5);
    numeros.add(1);
    numeros.add(2);

    // ordenando os numeros da lista:
    Collections.sort(numeros);
     // imprimindo os numeros com o for

    for (int i = 0; i < numeros.size(); i++) {
      System.out.println(numeros.get(i));
    }

    for ( Integer numero : numeros ) {
      System.out.println(numero);
    }

    System.out.println("----------------------");
    
    // Create instances of Titulo and add them to a list
        List<Filme> lista = new ArrayList<>();
        lista.add(new Filme("O magico de Oz"));
        lista.add(new Filme("Harry Potter e a pedra filosofal"));
        lista.add(new Filme("John Wick"));

        // Sort the list
        Collections.sort(lista);

        // Print the sorted titles
        for (Filme filme : lista) {
            System.out.println(filme.getNome());
        }

        System.out.println("----------------------");

        List<String> palavras = new ArrayList<>();
        palavras.add("banana");
        palavras.add("maça");
        palavras.add("melancia");
        palavras.add("abacaxi");
        System.out.println("----------------------");

        System.out.println("Lista original: " + palavras);
        System.out.println("----------------------");
        Collections.sort(palavras);
        System.out.println("Lista ordenada: " + palavras);
        System.out.println("----------------------");
        System.out.println("lista usando for para imprmir: ");
        for (String palavra : palavras) {
          System.out.println(palavra);
        }

        System.out.println("----------------------");

        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);

        System.out.println("----------------------");
        System.out.println("listaPolimorfica");

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);

      }
  }

