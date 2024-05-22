package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("LOST", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Serie novaSerie = new Serie("Naruto", 2000);
        novaSerie.exibeFichaTecnica();
        novaSerie.setTemporadas(10);
        novaSerie.setEpisodiosPorTemporada(10);
        novaSerie.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Naruto: " + novaSerie.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        // Filme filmeDoPaulo = new Filme();
        var filmeDoPaulo = new Filme("Dogville", 2003);
        //filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        Filme favorito = new Filme("Matrix", 1999);
        favorito.avalia(10);
        favorito.setDuracaoEmMinutos(90);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(favorito);

        System.out.println("tamanho da lista de filmes: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("Os filmes da sua lista sao; " + listaDeFilmes);
        System.out.println(" toString do filme: " + listaDeFilmes.get(0).toString());

        ArrayList<Serie> listaDeSeries = new ArrayList<>();
        listaDeSeries.add(lost);
        listaDeSeries.add(novaSerie);
        System.out.println("tamanho da lista de series: " + listaDeSeries.size());
        System.out.println("Primeira serie: " + listaDeSeries.get(0).getNome());
        System.out.println("ToString da serie: " + listaDeSeries.get(1).getNome());
        System.out.println("A sua lista de series contem: "  + listaDeSeries.get(0).getNome());
    }
}