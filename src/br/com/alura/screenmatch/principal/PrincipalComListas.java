package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {

    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Filme favorito = new Filme("Matrix", 1999);
        favorito.avalia(9);
        Serie novaSerie = new Serie("Naruto", 2000);
        Serie lost = new Serie("LOST", 2000);

        System.out.println("---------------------------------------------------");
        Filme f1 = filmeDoPaulo;

        System.out.println("O filme f1 é uma referencia ao filmeDoPaulo: " + f1.getNome());
        System.out.println("Esse e'o nome do filme do paulo agora: " + filmeDoPaulo.getNome());
        f1.setNome("A era do gelo");
        System.out.println("Aqui o nome de f1 foi trocado para: " + f1.getNome());
        System.out.println("DEPOIS DISSO ESSE É O NOME DO FILME DO PAULO: " + filmeDoPaulo.getNome());
        System.out.println("---------------------------------------------------");

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDoPaulo);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(favorito);
        listaDeAssistidos.add(lost);

        for (Titulo item : listaDeAssistidos) {
            System.out.println(item.getNome());
            // nesse if eu pergunto e ja declaro a variavel
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println(" Classificacao: " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        buscaPorArtista.add("Emilly");
        System.out.println("---------------------------------------------------");
        System.out.println("Lista da busca por artista: ");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("---------------------------------------------------");
        System.out.println("Lista ordenada: ");
        System.out.println(buscaPorArtista);

        Collections.sort(listaDeAssistidos);
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("Lista de filmes ordenada pelo nome: ");
        System.out.println(listaDeAssistidos);

        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        
        System.out.println("---------------------------------------------------");
        System.out.println("Lista de filmes ordenada pelo ano de lancamento: ");
        System.out.println(listaDeAssistidos);
    }
}